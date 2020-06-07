package testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Signup {
	//@Test(invocationCount=3)
	//@Test(invocationTimeOut=1000)
	//@Test(expectedExceptions = {ArithmeticException.class})
	@Test(expectedExceptions = {IOException.class})//gives error as it gives IOExceptionan throw Arithmetic exception
	public void m1() {
		System.out.println("Hello Testing Shastra");
        throw new ArithmeticException();
	}
	@DataProvider
	public void loginData() {
		System.out.println("");

	}

}
