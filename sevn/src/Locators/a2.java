package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class a2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		
		ob.findElementByLinkText("Images").click();
	    ob.findElementByPartialLinkText("Im").click();
	    
	}

}
