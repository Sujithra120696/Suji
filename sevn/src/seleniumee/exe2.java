package seleniumee;

import org.openqa.selenium.chrome.ChromeDriver;

public class exe2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://google.com");
		/*ob.executeScript("alert('time out')");*/
		ob.executeScript("Window confirm('time out')");
		
		Thread.sleep(3000);
		ob.findElementByLinkText("Images").click();
		Thread.sleep(3000);
		ob.navigate().back()	;
		Thread.sleep(3000);
		ob.navigate().forward()	;
		Thread.sleep(3000);
		ob.quit();
		
	}

}
