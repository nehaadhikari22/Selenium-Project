package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusofWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\\\workspaces\\\\Drivers\\\\chromedriver.exe");  

		WebDriver driver = new ChromeDriver();
				
		driver.get("https://ultimateqa.com/sample-application-lifecycle-sprint-3/");
		
	   //isDisplayed    isEnabled
		
		//header1
		WebElement Sample_Application_Lifecycle_Sprint_3 = driver.findElement(By.xpath("//h1[contains(text(),'Sample Application Lifecycle – Sprint 3')]"));
		
		System.out.println(" Sample_Application_Lifecycle_Sprint_3 Displayed Status:" + Sample_Application_Lifecycle_Sprint_3 .isDisplayed() );
		System.out.println(" Sample_Application_Lifecycle_Sprint_3 Enabled Status:" + Sample_Application_Lifecycle_Sprint_3 .isEnabled() );
		
		//header2
		WebElement Iteration_3 = driver.findElement(By.xpath("//h2[normalize-space()='Iteration 3']"));
		
		System.out.println(" Iteration 3 Displayed Status:" + Iteration_3 .isDisplayed() );
		System.out.println(" Iteration 3 Enabled Status:" + Iteration_3 .isEnabled() );
		
		//isSelected
		WebElement male = driver.findElement(By.xpath("//input[@value='male']"));
		WebElement female = driver.findElement(By.xpath("//input[@value='female']"));
		WebElement other = driver.findElement(By.xpath("//input[@value='other']"));
		
		System.out.println( "Male:"+male.isSelected() ); //true  
		System.out.println( female.isSelected() );  //false 
		System.out.println( other.isSelected() ); //false
		
		
		other.click(); //Giving Wrong result 
		System.out.println("Incorrect Result:"+ male.isSelected() ); //false
		System.out.println( "Incorrect Result:"+female.isSelected() );  //false 
		System.out.println( "Incorrect Result:"+other.isSelected() ); //true
		
		other.click();
		System.out.println( male.isSelected() ); //false
		System.out.println( female.isSelected() );  //false 
		System.out.println( "other:"+other.isSelected() ); //true
		
		female.click();
		System.out.println( male.isSelected() ); //false
		System.out.println( "Female:"+female.isSelected() );  //true
		System.out.println( other.isSelected() ); //false
		
		other.click();
		System.out.println( male.isSelected() ); //false
		System.out.println( female.isSelected() );  //false 
		System.out.println( "other:"+other.isSelected() ); //true
		
		driver.quit();
	}

}
