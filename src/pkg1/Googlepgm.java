package pkg1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		//title verification
		String expectedtitle="Google";
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		
		//content verification
		String src=driver.getPageSource();
		if(src.contains("Gmail")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		
		

	}

}
