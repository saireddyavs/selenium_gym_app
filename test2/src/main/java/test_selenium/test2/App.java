package test_selenium.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */

public class App 
{
   WebDriver driver;
   
   @Test
   public void test() throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	   ChromeOptions ChromeOptions = new ChromeOptions();
		  ChromeOptions.addArguments("--headless", "--no-sandbox");
		   driver=new ChromeDriver(ChromeOptions);
	   
		   driver.get(System.getenv("deployed_ip"));
	   
	   driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	   
	  
	   driver.findElement(By.xpath("//input[@name='username']")).click();
	   Thread.sleep(200);
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("saireddy");
	   driver.findElement(By.xpath("//input[@name='password']")).click();
	   Thread.sleep(200);
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
	   driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	   
	   
       
       
       
       
          
	   Thread.sleep(5000);
	   
	   System.out.println("in test");
	   
	   
	   
	   
	   driver.quit();
	   
   }
   
 
   
}
