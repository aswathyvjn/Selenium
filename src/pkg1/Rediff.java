package pkg1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
	ChromeDriver driver;
	@Before
	public void start() {
		driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test() {
		String actual=driver.findElement(By.xpath("//*[@id=\"Register\"]")).getAttribute("value");
		System.out.println("aaa");
		System.out.println(actual);
		System.out.println("ahghs");
		String expected="Create my account >>";
		if(actual.equals(expected)) {
			System.out.println("pass");
		}
		else {
			System.out.println("Fail");
		}
}
	
	@Test
	public void test1() {
		Boolean a=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(a) {
			System.out.println("Displayed");
		}
		else {
			System.out.println("Not Displayed");
		}
		
		Boolean b=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
		if(b) {
			System.out.println("Selected");
		}
		else {
			System.out.println("Not Selected");
		}
		
				
				
				
				
	}


}
