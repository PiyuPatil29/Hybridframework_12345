import org.testng.annotations.Test;

@Test
public class A {
	public void m1() {
		System.out.println("m1 of class A");
		throw new ArithmeticException();
	}
	@Test(dependsOnMethods= {"m1"})
		public void m2() {
			System.out.println("m2 of class A");
}
	@Test(groups= {"Regression","piyu"})
		public void m3() {
			System.out.println("m3 of class A");

		}
	@Test(groups= {"Regression"})
		public void m4() {
			System.out.println("m1 of class A");
	}
	@Test(dependsOnGroups= {"Regression"})
		public void m5() {
			System.out.println("m1 of class A");
	}
	@Test(groups= {"piyu"})
		public void m6() {
			System.out.println("m1 of class A");
	}
}


