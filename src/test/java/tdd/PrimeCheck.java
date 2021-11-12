package tdd;

public class PrimeCheck {
	
	  public boolean isPrime(int n) {
	        
	        int i,m=0;
	        boolean flag=true;      
	            
	        m=n/2;      
	        if(n==0||n==1){  
	         flag=false;     
	        }else{  
	         for(i=2;i<=m;i++){      
	          if(n%i==0){            
	           flag=false;      
	           break;      
	          }      
	         }        
	        }
	    
	        return flag;
	    }

}
