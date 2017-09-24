package TestNG;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups={"lenova"})
	public void  lenova() 
	{
		System.out.println("Bought  lenova");
	}
	@Test(groups={"lenova"})
	public void lenova2() 
	{
		System.out.println("lenova2");
	}
	@Test(groups={"Dell"})
	public void  Dell() 
	{
		System.out.println("Bought  Dell");
	}
	@Test(groups={"Dell"})
	public void  Dell2() 
	{
		System.out.println("Bought  Dell2");
	}
	
	
	
	
}
