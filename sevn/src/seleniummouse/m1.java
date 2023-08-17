package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.switchTo().frame(0);
		ob.findElementById("datepicker").click();
		for(int i=0;i<2;i++)
		{
		ob.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
		}
		ob.findElementByCssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(5) > td:nth-child(3) > a").click();
}
}
