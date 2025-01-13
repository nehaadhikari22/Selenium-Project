package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\\\workspaces\\\\Drivers\\\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        driver.get("https://courses.ultimateqa.com/users/sign_in");
	        
	        // Step 2: Locate the username and password fields and enter valid credentials
	        WebElement emailField = driver.findElement(By.id("user[email]"));
	        WebElement passwordField = driver.findElement(By.id("user[password]"));
	        emailField.sendKeys("sawij46784@suggets.com");  // Replace with actual test email
	        passwordField.sendKeys("Pinky@12345");  // Replace with actual test password
	        
	     // Step 3: Click the 'Sign In' button
	        WebElement signInButton = driver.findElement(By.xpath("//button[normalize-space()='Sign in']"));
	        signInButton.click();
	        
	        // Step 4: Wait for the page to load (Simple wait for demonstration, use WebDriverWait for better practices)
		        try {
		            Thread.sleep(5000); // Wait for 2 seconds for the page to load after login
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		        
		     // Step 5: Verify that the login was successful
		        // For example, checking if a logout button or user-specific element is visible after login
		        WebElement H1header = driver.findElement(By.xpath("//img[@class='logo img-responsive']"));  // Change this according to the page
		       // Assert.assertTrue(H1header.isDisplayed(), "Login failed, user profile icon not displayed.");
				
				System.out.println(" H1header Displayed Status:" + H1header .isDisplayed() );
				
				
				driver.quit();
		    

		    
		        

	}

}
