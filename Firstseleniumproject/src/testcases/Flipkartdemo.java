package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Flipkartdemo {
	public static WebDriver driver;
	@Test
		public void openBrowser() {
			System.setProperty("webdriver.chrome.driver", "D:\\software\\Selenium driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.navigate().to("https://www.flipkart.com");
	     	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

			}
	@Test
	public void logIn() {
		driver.findElement(By.partialLinkText("Login")).click();
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("piyupatil5029@gmail.com");
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("piyupatil5029@gmail.com");
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("nishikantpatil");
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
	}
}
