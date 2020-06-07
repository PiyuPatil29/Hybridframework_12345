import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestAnnotations {
	@Parameters({"Rollno","StudentName"})
	@Test
	public void m1(String Rollno ,String StudentName) {
			System.out.println("I am m1 test case"+Rollno);
			System.out.println("piyu"+StudentName);
	}
	@BeforeTest
	public void m2() {
           System.out.println("I am Before test case");
	}
	@Test
	public void m3() {
           System.out.println("I am m2 test case");
	}
	@AfterTest
	public void m4() {
		System.out.println("After Test");
	}
	@BeforeSuite
	public void m5() {
		System.out.println("Before Suite");

	}
	@AfterSuite
	public void m6() {
		System.out.println("After Suite");
	}
	@BeforeMethod
	public void m7() {
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void m8() {
		System.out.println("AfterMethod");

	}
	@DataProvider
	public void m9() {
		System.out.println("DataProvider");

	}
	@BeforeClass
	public void m10() {
		System.out.println("I am BeforeClass");
	}
	@AfterClass
public void m11() {
	System.out.println("Afterclass");

}
}
