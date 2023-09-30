package pkg1;

import java.io.File;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotElement {
	ChromeDriver driver;
	@Before
	public void initialize() {
		driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	
	@After
	public void test() throws Exception {
		WebElement date=driver.findElement(By.xpath("//*[@id=\\\"tblcrtac\\\"]/tbody/tr[22]/td[3]/select[1]"));
		File src=date.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./SS//Elementscreenshot1.png"));
		
	}
	
	@After
	public void closebrowser() {
		driver.close();
	}

}
