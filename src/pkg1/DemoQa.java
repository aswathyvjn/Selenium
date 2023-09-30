package pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQa {
	ChromeDriver driver;
	@Before
	public void start() {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
	}
	
	@Test
	public void test() {
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		driver.switchTo().alert().accept();
//		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
//		driver.switchTo().alert().accept();
		
		
	}
	
	@After
	public void closebrowser() {
		driver.close();
	}

}
