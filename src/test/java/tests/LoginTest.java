package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
import pages.LoginPage;

public class LoginTest extends BaseClass {
	
	
	
	@Test
	@Parameters({"UserName","Password"})
	public void PositiveLogin(String correctUser, String correctPass) {
		test = report.startTest("Positive Login Test");
		LoginPage loginPage = new LoginPage();
		loginPage.Login(correctUser,correctPass);
		report.endTest(test);
	}
	@Test
	@Parameters({"wrongUser","Password"})
	public void NegativeLogin(String wrongUser, String wrongPass) {
		test = report.startTest("Negative Login Test");
		LoginPage loginPage = new LoginPage();
		loginPage.Login(wrongUser,wrongPass);
//		Assert.assertTrue(false);
		loginPage.Errorcheck();
		report.endTest(test);
	}
	
	@Test
	public void ExcelTest() throws IOException {
		
		String User = sheet.getRow(1).getCell(0).getStringCellValue();
		String Pass = sheet.getRow(1).getCell(1).getStringCellValue();
		LoginPage loginPage = new LoginPage();
		loginPage.Login(User,Pass);
		loginPage.Errorcheck();
		report.endTest(test);
	}
	
}
