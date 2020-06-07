import org.testng.annotations.Test;

public class C {
	@Test(groups= {"Regression","piyu"})
	
	public void m1() {
		System.out.println("m1 of class C");
	}
	@Test(groups= {"Regression"})
		public void m2() {
			System.out.println("m2 of class C");
}
	@Test(groups= {"piyu"})
		public void m3() {
			System.out.println("m3 of class C");

		}
	@Test
		public void m4() {
			System.out.println("m1 of class C");
	}
	@Test
		public void m5() {
			System.out.println("m1 of class C");
	}
	@Test
		public void m6() {
			System.out.println("m1 of class A");
	}


}
