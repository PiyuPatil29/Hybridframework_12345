import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcases {
	public static WebDriver driver;
	@BeforeTest
    public void openBrowser() throws Throwable {
    		System.setProperty("webdriver.chrome.driver", "D:\\software\\Selenium driver\\chromedriver.exe");
    		WebDriver driver=new ChromeDriver();
    		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    		driver.manage().window().maximize();
    		driver.get("https://www.freecrm.com");
	}
	@Test
	public void titleofPage() {
		String title=driver.getTitle();
		System.out.println("title of page is "+title);
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
	}	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}

    
  



