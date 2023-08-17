package Operators;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;



public class s1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		
		Set<Cookie> s = ob.manage().getCookies();
		System.out.println("Number of cookies "+s.size());
		for(Cookie x:s)
		{
			System.out.println(x.getName());
			System.out.println(x.getValue());
			System.out.println(x.getDomain());
			System.out.println(x.getExpiry());
			System.out.println();
		}
		ob.quit();
	}

}
