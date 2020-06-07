import org.testng.annotations.Test;

public class B {
	public void m1() {
		System.out.println("m1 of class B");
	}
	@Test(groups= {"Regression","piyu"})
		public void m2() {
			System.out.println("m2 of class B");
}
	@Test(groups= {"Regression"})
		public void m3() {
			System.out.println("m3 of class B");

		}
	@Test(groups= {"piyu"})
		public void m4() {
			System.out.println("m1 of class B");
	}
	@Test(groups= {"Regression","piyu"})
		public void m5() {
			System.out.println("m1 of class B");
	}
	@Test
		public void m6() {
			System.out.println("m1 of class A");
	}


}
