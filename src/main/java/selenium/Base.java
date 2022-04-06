package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static void main(String[] args) {
				
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stg.shakticoin.com/register");
		driver.findElement(By.id("email")).sendKeys("saurabh2@gmail.com");
		driver.findElement(By.id("recaptcha-anchor")).click();	
	}
}
