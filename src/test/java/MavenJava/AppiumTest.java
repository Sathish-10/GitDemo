package MavenJava;

import org.testng.annotations.Test;

public class AppiumTest {
	@Test(invocationCount = 5)
	public void AndroidApps()
	{
		System.out.println("AndroidApps");
	}
	@Test
	public void IOSApps()
	{
		System.out.println("IOSApps");
	}
}
