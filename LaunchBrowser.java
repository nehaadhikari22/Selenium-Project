package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\\\workspaces\\\\Drivers\\\\chromedriver.exe");  

		WebDriver driver = new ChromeDriver();
				
		driver.get("https://ultimateqa.com/automation");
		
	    System.out.println("Title of the page:" + driver.getTitle() );
	    
	    System.out.println("Current URL of the webpage:" + driver.getCurrentUrl() );
	    
	    //System.out.println("PageSource of the webpage:" + driver.getPageSource() );
	    
	  
		
		driver.quit();


	}

}
