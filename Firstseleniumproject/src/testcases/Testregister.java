package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testregister {
	WebDriver driver;
	@Test
	public void registerTest() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\Selenium driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]")).click();
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a#createAccountSubmit")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println("get title "+title);
		driver.findElement(By.id("ap_customer_name")).sendKeys("piyu patil");
		driver.findElement(By.cssSelector("#ap_phone_number")).sendKeys("7972481090");
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("piyupatil5021@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nishikantpatil");
		driver.findElement(By.id("continue")).click();
		Select select=new Select(driver.findElement(By.cssSelector("#searchDropdownBox")));
		select.selectByVisibleText("Baby");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		driver.close();
		if(title.contains("Sign in")) {
			System.out.println("Test case is passed");
		}
		else {
			System.out.println("Test case is failed");
		}
		}
	
	}	


