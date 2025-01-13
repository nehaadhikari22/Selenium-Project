package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\\\workspaces\\\\Drivers\\\\chromedriver.exe");  

		WebDriver driver = new ChromeDriver();
				
		driver.get("https://ultimateqa.com/automation");
		
	    System.out.println("Title of the page:" + driver.getTitle() );
	    
	    driver.navigate().to("https://ultimateqa.com/complicated-page");
		System.out.println("Title of the page:" + driver.getTitle() );
		
		driver.navigate().to("https://ultimateqa.com/fake-landing-page" );
		System.out.println("Title of the page:" + driver.getTitle() );
		
		driver.navigate().to("https://ultimateqa.com/automation/fake-pricing-page/");
		System.out.println("Title of the page:" + driver.getTitle() );
		
		driver.navigate().to("https://ultimateqa.com/filling-out-forms/");
		System.out.println("Title of the page:" + driver.getTitle() );
		
		
		driver.navigate().to("https://courses.ultimateqa.com/users/sign_in");
		System.out.println("Title of the page:" + driver.getTitle() );
		
		driver.navigate().back();
		System.out.println("Title of the page:" + driver.getTitle() );
		
		driver.navigate().forward();
		System.out.println("Title of the page:" + driver.getTitle() );
		
		driver.navigate().refresh();
		System.out.println("Title of the page:" + driver.getTitle() );
		
		driver.navigate().back();
		System.out.println("Title of the page:" + driver.getTitle() );
		
		driver.quit();

	}

}
