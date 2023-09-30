package pkg1;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOptions {
ChromeDriver driver;
	
	@Before
	public void start() {
		driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test() {
		WebElement day = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select d = new Select(day);
		List<WebElement> li = d.getOptions();
		System.out.println("day size is "+ li.size());
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select mon = new Select(month);
		List<WebElement> l = mon.getOptions();
		System.out.println("day size is "+ l.size());
		
		
	}

}
