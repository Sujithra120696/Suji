package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		
		ob.findElementById("user").sendKeys("Dhivyakarthi123");
		ob.findElementByName("pass").sendKeys("12345");
		ob.findElementByClassName("btn_log").click();
		
	}

}
