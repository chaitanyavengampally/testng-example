package testcases;
import org.testng.annotations.Test;
public class Exclude {
	@Test
	public void methodA() {
		System.out.println("method A");
	}
	@Test
	public void methodB() {
		System.out.println("method B");
	}
	@Test
	public void methodC() {
		System.out.println("method C");
	}
	@Test
	public void methodD() {
		System.out.println("method D");
	}
	
}
