package AllAnnotation;

import org.testng.annotations.Test;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BeforeAnnotation {
	@Test
	public void Test() throws InterruptedException
	{
		//Properties prop = new Properties();
		 //defining the project path
		// String projectPath = System.getProperty("/home/active35/eclipse-workspace/Script/Drivers/chromedriver");
		
	//	System.setProperty("webdriver.chrome.driver", "/home/active35/eclipse-workspace/Script/Drivers/chromedriver");
		WebDriverManager.chromedriver().setup();  // this is to set the webdriver manager
		System.out.println("First Demo Session");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize(); // to maximise the browser 
	  driver.get("https://www.google.co.in/"); // Open the browser
	  	
	  driver.findElement(By.name("q")).sendKeys("HYR Tutorial", Keys.ENTER);
	  System.out.println(driver.getTitle());
	  Thread.sleep(5000);
	
	
	  driver.quit();
	  
	 
	 
	 
		
	}

}
