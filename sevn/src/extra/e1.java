package extra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class e1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String setProperty = System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
	
		ob.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		ob.get("https://demoqa.com");
	}



}
