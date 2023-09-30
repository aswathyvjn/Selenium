package pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitPgrm {
	ChromeDriver driver;
	String actual;
	@Before
	public void setup() {
	    driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	
	@Test
	public void test() {
//		actual= driver.getTitle();
//		System.out.println(actual);
//		String expected = "Google";
//		if (actual.equals(expected)){
//			System.out.println("Pass");
//		}
//		else {
//			System.out.println("Fail");
//		}
//
		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		
		//driver.findElement(By.name("btnK")).click();
		
	}
		
		
	

	@After
	public void browserclose() {
		driver.close();
	}
	

}
