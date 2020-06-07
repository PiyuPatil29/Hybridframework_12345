package testcases;

import org.testng.annotations.Test;

public class Gmaillogin {
	@Test(priority=1)
	public void loginPage(){
		System.out.println("login");
	}
	@Test(priority=2)
	public void passType() {
		System.out.println("password");
	}
	@Test(priority=3)
	public void logOut() {
		System.out.println("Logout");
	}
}
