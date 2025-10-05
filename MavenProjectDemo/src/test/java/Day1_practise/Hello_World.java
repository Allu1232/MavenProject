package Day1_practise;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Hello_World {
	 
	
	 public static void main(String[] args) {
		 String str="Automation";
		 String org=str.toLowerCase();
			String rev="";
			
	        for(int i=org.length()-1; i>=0; i--) {
	         
	        	rev+=org.charAt(i);}
	        
	        	
	        	 if(rev.equals(org)) {
	        		 System.out.println(str+"is a palindrome");
	        	 }
	        		 else {
	        			 System.out.println(str+"::is not a palindrome");
	        			 System.out.print(rev);
	        		 }
	        	 }
	         }
		

	
