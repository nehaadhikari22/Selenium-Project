package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://demo.nopcommerce.com/");
		
		Driver.quit();

	}

}
