package Seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
	
		ob.get("http://www.letskodeit.com/practice");
		ob.findElementById("bmwradio").click();
		Thread.sleep(2000);
		ob.findElementById("benzradio").click();
		Thread.sleep(2000);
		ob.findElementById("hondaradio").click();
		Thread.sleep(2000);
		
		ob.quit();
	}

}
