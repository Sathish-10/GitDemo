package MavenJava;

import org.testng.annotations.Test;

public class AppiumTest {
	@Test(invocationCount = 5)
	public void AndroidApps()
	{
		System.out.println("AndroidApps");
		System.out.println("AndroidApps1");
		System.out.println("AndroidApps2");
		System.out.println("AndroidApps3");
	}
	@Test
	public void IOSApps()
	{
		System.out.println("IOSApps");
	}
}
