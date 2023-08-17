package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class i5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
	
		ob.get("http://www.mycontactform.com");
		//ob.findElementByXPath("html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input").sendKeys("hi");
		//relative
				// starts with//
				// syntax:    //*[@locator/attribute='value']    or  //tagname[@locator/attribute='value']
				//shortuct: copy xpath
				
				ob.findElementByXPath("//*[@id='user']").sendKeys("SujithraVarun");
				
				ob.findElementByXPath("//*[@type='password']").sendKeys("12345");
				
				ob.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input").click();
	}

}
