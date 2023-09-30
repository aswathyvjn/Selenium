package pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitAmazon {
	ChromeDriver driver;
	@Before
	public void start() {
		driver=new ChromeDriver ();
		driver.get("https://www.amazon.in");
	}
	
	@Test
	public void test() {
		String s=driver.getTitle() ;
		String expected="Amazon";
		if(s.equals(expected)) {
			System.out.println("Title Pass");
		}
		else {
			System.out.println("Title fail");
		}
		
	}
	
	@Test
	public void test1() {
		String p=driver.getPageSource();
		if(p.contains("data")) {
			System.out.println("content Pass");
		}
		
		else {
			System.out.println("Content Fail");
		}
		
	}
	
	@After
	public void closebrowser() {
		driver.close();
		
	}

}
