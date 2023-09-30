package pkg1;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {
	ChromeDriver driver;
	
	@Before
	public void  start() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	}
	
	@Test
	public void test() {
//		WebElement day = driver.findElement(By.name("birthday_day"));
//		Select d = new Select(day);
//		d.selectByIndex(3);
//		List<WebElement> li = d.getOptions();
//		System.out.println("number of day elements "+ li.size());
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select mon = new Select (month);
		mon.selectByValue("10");
		List<WebElement> l = mon.getOptions();
		System.out.println("Number of month elements "+l.size());
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select y= new Select(year);
		y.selectByVisibleText("1996");
		List<WebElement> h = y.getOptions();
		System.out.println("Number of year value "+h.size());
		
		
		
	}
	

}
