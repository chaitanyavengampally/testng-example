package testcases;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority=2)
	public void methodA() {
		System.out.println("method A");
	}
	@Test(priority=1)
	public void methodB() {
		System.out.println("method B");
	}
	@Test(priority=3)
	public void methodC() {
		System.out.println("method C");
	}

}
