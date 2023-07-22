package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class demo2 {
   WebDriver driver;
	@Test
	public void setup() {
	System.setProperty("webdriver.chrome.driver","D:\\seleniumwebdriver\\chromedriver\\chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
     driver = new ChromeDriver(co);
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
   // driver.close();
}
	@Test
	public void getTitle() {
		System.setProperty("webdriver.chrome.driver","D:\\seleniumwebdriver\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	     driver = new ChromeDriver(co);
	    driver.get("https://www.google.com");
		System.out.println("title is" + driver.getTitle());
	}
}
