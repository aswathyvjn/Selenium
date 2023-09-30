package pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	ChromeDriver driver;
	@Before
	public void start() {
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Gautham/Documents/mysite.html");
	}
	
	@Test
	public void test() {
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		System.out.println("1");
		driver.switchTo().alert().accept();
		System.out.println("2");
	}
	
	@After
	public void closebrowser() {
		driver.close();
	}

}
