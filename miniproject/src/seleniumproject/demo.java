package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\seleniumwebdriver\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.close();
	}

}
