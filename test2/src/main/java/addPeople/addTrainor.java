package addPeople;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class addTrainor {
	
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
		   Thread.sleep(500);
		   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("saireddy");
		   driver.findElement(By.xpath("//input[@name='password']")).click();
		   Thread.sleep(500);
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		   driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		   
		   
	      
	       
	       
		   
		   
		   
		   WebElement username,password,login,Confirm_password,street,city,phone,name;
		   Thread.sleep(500);
		   driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
	       
	       driver.findElement(By.xpath("//button[contains(text(),'Add Trainer')]")).click();
     
	        name= driver.findElement(By.xpath("//input[@id='name']"));
    
	       username= driver.findElement(By.xpath(" //input[@id='username']"));
      
	        password= driver.findElement(By.xpath("//input[@id='password']"));
	        Confirm_password= driver.findElement(By.xpath("//input[@id='confirm']"));
	       street= driver.findElement(By.xpath("//input[@id='street']"));
	       city= driver.findElement(By.xpath("//input[@id='city']"));
	        phone= driver.findElement(By.xpath(" //input[@id='phone']"));
	        
	        
	       name.click();
	       Thread.sleep(200);
	       name.sendKeys("trainer1");
	       username.click();
	       Thread.sleep(200);
	       username.sendKeys("trainer1");
	       password.click();
	       Thread.sleep(200);
	       password.sendKeys("trainer1");
	       Confirm_password.click();
	       Thread.sleep(200);
	       Confirm_password.sendKeys("trainer1");
	       street.click();
	       Thread.sleep(200);
	       street.sendKeys("trainer1 street");
	       city.click();
	       Thread.sleep(200);
	       city.sendKeys("trainer1 city");
	       phone.click();
	       Thread.sleep(200);
	       phone.sendKeys("1234567890");
	       
	       driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	       
	       Thread.sleep(2000);
	       
	       
	       driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
	       
	       
	       driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
	       
	       driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
	       
	       Thread.sleep(200);
	       driver.findElement(By.xpath("//button[contains(text(),'Add Trainer')]")).click();
     
	        name= driver.findElement(By.xpath("//input[@id='name']"));
    
	       username= driver.findElement(By.xpath(" //input[@id='username']"));
      
	        password= driver.findElement(By.xpath("//input[@id='password']"));
	        Confirm_password= driver.findElement(By.xpath("//input[@id='confirm']"));
	       street= driver.findElement(By.xpath("//input[@id='street']"));
	       city= driver.findElement(By.xpath("//input[@id='city']"));
	        phone= driver.findElement(By.xpath(" //input[@id='phone']"));
	       
	       name.click();
	       Thread.sleep(200);
	       name.sendKeys("trainer2");
	       username.click();
	       Thread.sleep(200);
	       username.sendKeys("trainer2");
	       password.click();
	       Thread.sleep(200);
	       password.sendKeys("trainer2");
	       Confirm_password.click();
	       Thread.sleep(200);
	       Confirm_password.sendKeys("trainer2");
	       street.click();
	       Thread.sleep(200);
	       street.sendKeys("trainer2 street");
	       city.click();
	       Thread.sleep(200);
	       city.sendKeys("trainer2 city");
	       phone.click();
	       Thread.sleep(200);
	       phone.sendKeys("1234567890");
	       
	       driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	       	
	       Thread.sleep(500);
	       
	       driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
	       
	       
	       driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
	       
	       driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
	       
	       Thread.sleep(200);
	       
	       
	       driver.findElement(By.xpath("//button[contains(text(),'Add Trainer')]")).click();
	       
	        name= driver.findElement(By.xpath("//input[@id='name']"));
   
	       username= driver.findElement(By.xpath(" //input[@id='username']"));
     
	        password= driver.findElement(By.xpath("//input[@id='password']"));
	        Confirm_password= driver.findElement(By.xpath("//input[@id='confirm']"));
	       street= driver.findElement(By.xpath("//input[@id='street']"));
	       city= driver.findElement(By.xpath("//input[@id='city']"));
	        phone= driver.findElement(By.xpath(" //input[@id='phone']"));
	       
	       name.click();
	       Thread.sleep(200);
	       name.sendKeys("trainer3");
	       username.click();
	       Thread.sleep(200);
	       username.sendKeys("trainer3");
	       password.click();
	       Thread.sleep(200);
	       password.sendKeys("trainer3");
	       Confirm_password.click();
	       Thread.sleep(200);
	       Confirm_password.sendKeys("trainer3");
	       street.click();
	       Thread.sleep(200);
	       street.sendKeys("trainer3 street");
	       city.click();
	       Thread.sleep(200);
	       city.sendKeys("trainer3 city");
	       phone.click();
	       Thread.sleep(200);
	       phone.sendKeys("1234567890");
	       
	       driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	       
	       
	       Thread.sleep(2000);
	       
	       driver.quit();
       
	       
	       
	       
	   }

}
