package pkg1;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
	ChromeDriver driver;
	
	@Before
	public void initial() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@Test
	public void test() {
		List<WebElement> l = driver.findElements(By.tagName("a"));
		System.out.println("number of links is "+l.size());
		List<String> s = new ArrayList<String>(l.size());
		for(WebElement i:l) {
		System.out.println(i.getAttribute("href"));
		}
	}
	
	@After
	public void closebrowser() {
		driver.close();
	}
}
