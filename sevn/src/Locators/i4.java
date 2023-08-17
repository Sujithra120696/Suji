package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class i4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
	
		ob.get("http://www.mycontactform.com");
	   //ob.findElementByCssSelector("input#user").sendKeys("hi"); 
	   //ob.findElementByCssSelector("input.txt_log").sendKeys("hi");
	}
	 //ob.findElementByCssSelector("input[type='text']").sendKeys("hi");
	  // ob.findElementByCssSelector("input[type^te='te']").sendKeys("hi");


}
