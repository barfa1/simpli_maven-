package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import tests.BaseClass;

@Test
public class LoginPage {
	
	WebDriver driver = BaseClass.driver;
	ExtentTest test = BaseClass.test;
//	==================== WebElements ===================
	@FindBy(linkText="Log in")
	WebElement loginlink;
	
	@FindBy(name="user_login")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(className="rememberMe")
	WebElement rem;
	
	@FindBy(name="btn_login")
	WebElement login;
	
//	==================== init Elements in Class constructor ==========
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

//	================ class Methods =====================
	@Parameters({"UserName","Password"})
	public void Login(String UsernameVal , String Password) {
		
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOf(loginlink));
		
		loginlink.click();
//		test.log(LogStatus.PASS, "Click on login link", "Successfully clicked the link");

		username.sendKeys(UsernameVal);
//		test.log(LogStatus.PASS, "Entered username "+UsernameVal, "Successfully Enetered username");

		password.sendKeys(Password);
//		test.log(LogStatus.PASS, "Entered password "+Password, "Successfully Enetered Password");
		
		
		rem.click();

		login.click();
//		test.log(LogStatus.PASS, "clicked login button ", "Successfully clicked login button");
		
	}
	
	public void Errorcheck() {
		WebElement msg = driver.findElement(By.id("msg_box"));
		String msg1 = msg.getText();
		String checkMessage = "The email or password you have entered is invalid.";
		
//		Assert.assertEquals(msg1, checkMessage);
		SoftAssert asrt = new SoftAssert();
		asrt.assertEquals(msg1, checkMessage);
		System.out.println("========================");
		asrt.assertAll();
	}
}
