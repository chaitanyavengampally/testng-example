package testcases;

import org.testng.annotations.Test;

public class SkipEnable {
	
	@Test(enabled=false)
	public void method1() {
		System.out.println("method one executed");
	}
	@Test
	public void method2() {
		System.out.println("method two executed");
	}
	@Test
	public void method3() {
		System.out.println("method three executed");
	}
	@Test(enabled=false)
	public void method4() {
		System.out.println("method four executed");
	}
	@Test
	public void method5() {
		System.out.println("method five executed");
	}
	
	
	
}
