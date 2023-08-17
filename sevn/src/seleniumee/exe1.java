package seleniumee;

import org.openqa.selenium.chrome.ChromeDriver;

public class exe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://facebook.com");
		System.out.println(ob.executeScript("return document.title"));
		System.out.println(ob.executeScript("return document.url"));
	}

}
