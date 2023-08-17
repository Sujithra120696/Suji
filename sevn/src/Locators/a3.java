package Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
	List<WebElement> i=ob.findElementsByTagName("img");
	System.out.println("Number of images "+i.size());
	List<WebElement> i1=ob.findElementsByTagName("a");
	System.out.println("Number of links "+i1.size());
	
	List<WebElement> i2=ob.findElementsByTagName("div");
	System.out.println("Numer of elements wiith Div "+i2.size());
	}

}
