package Scrollers;

import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();

	/*ob.get("http://www.letskodeit.com/practice");
	ob.executeScript("window.scrollBy(0,200)");
	Thread.sleep(3000);
	ob.executeScript("window.scrollBy(0,-200)");
	Thread.sleep(3000);
	ob.quit();*/
	

	ob.get("http://www.threads.com");
	ob.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(3000);
	ob.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	Thread.sleep(3000);
	ob.quit();
	}

}
