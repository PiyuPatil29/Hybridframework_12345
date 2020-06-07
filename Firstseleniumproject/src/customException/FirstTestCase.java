package customException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class FirstTestCase {                          //if Test is written will become test case
	public void TC_02() {
		System.out.println("This is TC_02");

	}
//@Test
	public void TC_01() {
	//	System.setProperty("webdriver.chrome.driver", "D:\\software\\Selenium driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]"));
	    driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		String title=driver.getTitle();
	    	if(title.contains("Sign In")) {
	    		System.out.println("Test case is passed");
	    	}else {
	    		System.out.println("Test case is failed");
	    	}


	}

}
