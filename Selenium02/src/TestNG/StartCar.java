package TestNG;

import org.testng.annotations.Test;

public class StartCar {
	@Test(priority=0)
    public void startEngine() {
    	System.out.println("EngineStart");
		
	}
	@Test(priority=1)
    public void putFirstGear() {
    	
    	System.out.println("putFirstGear");
		
	}
	@Test(priority=2)
 public void putSecondGear() {
    	
    	System.out.println("putSecondGear");
		
	}
	@Test(priority=3)
 public void putThirdGear() {
 	
 	System.out.println("putThirdGear");
		
	}
			
    
}
