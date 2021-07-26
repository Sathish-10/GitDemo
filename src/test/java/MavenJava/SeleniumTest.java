package MavenJava;

import org.testng.annotations.Test;

public class SeleniumTest {

	@Test
	public void browserLoad()
	{
		System.out.println("Browser Load");
		System.out.println("Browser Load2");
		System.out.println("Browser Load3");
	}
	@Test
	public void browserClose() 
	{
		System.out.println("Browser Close");
		System.out.println("Browser Close2");
		System.out.println("Browser Close3");
	}
	@Test
	public void browserCloses() 
	{
		System.out.println("Browser Close");
		System.out.println("Browser Close2");
		System.out.println("Browser Close3");
	}
	@Test
	public void browserClosed() 
	{
		System.out.println("Browser Close");
		System.out.println("Browser Close2");
		System.out.println("Browser Close3");
	}
}
