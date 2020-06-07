import org.testng.annotations.Test;

public class Testcase {
	
	@Test(priority=3)
	public void m1() {
		System.out.println("I am test case1");
	}
	
	@Test(priority=1)
	public void m2() {
		System.out.println("I am test case2");
	}
	
	@Test(priority=0)
	public void m3() {
		System.out.println("I am test case3");
    }
	
	@Test(priority=5,enabled=false)
	public void m4() {
		System.out.println("I am test case4");

	}
	@Test(priority=4,enabled=false)
	public void m5() {
		System.out.println("I am test case5");

	}

}
