package addPlans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class addPlans {
  @Test
  public void f() throws InterruptedException {
	  
WebDriver driver;
	  
	  
	  System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	  ChromeOptions ChromeOptions = new ChromeOptions();
	  ChromeOptions.addArguments("--headless", "--no-sandbox");
	   driver=new ChromeDriver(ChromeOptions);
	   
	   driver.get("http://13.127.16.30");
	   
	   driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	   
	  
	   driver.findElement(By.xpath("//input[@name='username']")).click();
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("trainer1");
	   driver.findElement(By.xpath("//input[@name='password']")).click();
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("trainer1");
	   driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	   
	   
     
      
      
	   
	   
	   
	   WebElement plan_name,Exercise,reps,sets;
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
	   
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-lg']")).click();
	   
	   Thread.sleep(200);
	   
	   plan_name=driver.findElement(By.xpath("//input[@id='name']"));
	   Exercise=driver.findElement(By.xpath("//input[@id='exercise']"));
	   reps=driver.findElement(By.xpath(" //input[@id='reps']"));
	   sets=driver.findElement(By.xpath("//input[@id='sets']"));
	   
	   Exercise.click();
	   Thread.sleep(200);
	   Exercise.sendKeys("Exercise1");
	   Thread.sleep(200);
	   
	   reps.click();
	   Thread.sleep(200);
	   reps.sendKeys("10");
	   Thread.sleep(200);
	   
	  sets.click();
	   Thread.sleep(200);
	   sets.sendKeys("10");
	   Thread.sleep(200);
	   
	   plan_name.click();
	   Thread.sleep(200);
	   plan_name.sendKeys("plan1");
	   Thread.sleep(200);
	   
	   driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	   
	   
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
	   
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-lg']")).click();
	   
	   Thread.sleep(200);
	   
	   plan_name=driver.findElement(By.xpath("//input[@id='name']"));
	   Exercise=driver.findElement(By.xpath("//input[@id='exercise']"));
	   reps=driver.findElement(By.xpath(" //input[@id='reps']"));
	   sets=driver.findElement(By.xpath("//input[@id='sets']"));
	   
	   Exercise.click();
	   Thread.sleep(200);
	   Exercise.sendKeys("Exercise2");
	   Thread.sleep(200);
	   
	   reps.click();
	   Thread.sleep(200);
	   reps.sendKeys("10");
	   Thread.sleep(200);
	   
	  sets.click();
	   Thread.sleep(200);
	   sets.sendKeys("10");
	   Thread.sleep(200);
	   
	   plan_name.click();
	   Thread.sleep(200);
	   plan_name.sendKeys("plan2");
	   Thread.sleep(200);
	   driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	   
	   
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
	   
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-lg']")).click();
	   
	   Thread.sleep(200);
	   
	   plan_name=driver.findElement(By.xpath("//input[@id='name']"));
	   Exercise=driver.findElement(By.xpath("//input[@id='exercise']"));
	   reps=driver.findElement(By.xpath(" //input[@id='reps']"));
	   sets=driver.findElement(By.xpath("//input[@id='sets']"));
	   
	   Exercise.click();
	   Thread.sleep(200);
	   Exercise.sendKeys("Exercise3");
	   Thread.sleep(200);
	   
	   reps.click();
	   Thread.sleep(200);
	   reps.sendKeys("10");
	   Thread.sleep(200);
	   
	  sets.click();
	   Thread.sleep(200);
	   sets.sendKeys("10");
	   Thread.sleep(200);
	   
	   plan_name.click();
	   Thread.sleep(200);
	   plan_name.sendKeys("plan3");
	   driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	   Thread.sleep(5000);
	   
	   
	   driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	   
	   driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	   
		  
	   driver.findElement(By.xpath("//input[@name='username']")).click();
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("trainer2");
	   driver.findElement(By.xpath("//input[@name='password']")).click();
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("trainer2");
	   driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	   
	   
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
	   
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-lg']")).click();
	   
	   Thread.sleep(200);
	   
	   plan_name=driver.findElement(By.xpath("//input[@id='name']"));
	   Exercise=driver.findElement(By.xpath("//input[@id='exercise']"));
	   reps=driver.findElement(By.xpath(" //input[@id='reps']"));
	   sets=driver.findElement(By.xpath("//input[@id='sets']"));
	   
	   Exercise.click();
	   Thread.sleep(200);
	   Exercise.sendKeys("Exercise4");
	   Thread.sleep(200);
	   
	   reps.click();
	   Thread.sleep(200);
	   reps.sendKeys("10");
	   Thread.sleep(200);
	   
	  sets.click();
	   Thread.sleep(200);
	   sets.sendKeys("10");
	   Thread.sleep(200);
	   
	   plan_name.click();
	   Thread.sleep(200);
	   plan_name.sendKeys("plan4");
	   Thread.sleep(200);
	   
	   driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	   
	   
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
	   
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-lg']")).click();
	   
	   Thread.sleep(200);
	   
	   plan_name=driver.findElement(By.xpath("//input[@id='name']"));
	   Exercise=driver.findElement(By.xpath("//input[@id='exercise']"));
	   reps=driver.findElement(By.xpath(" //input[@id='reps']"));
	   sets=driver.findElement(By.xpath("//input[@id='sets']"));
	   
	   Exercise.click();
	   Thread.sleep(200);
	   Exercise.sendKeys("Exercise5");
	   Thread.sleep(200);
	   
	   reps.click();
	   Thread.sleep(200);
	   reps.sendKeys("10");
	   Thread.sleep(200);
	   
	  sets.click();
	   Thread.sleep(200);
	   sets.sendKeys("10");
	   Thread.sleep(200);
	   
	   plan_name.click();
	   Thread.sleep(200);
	   plan_name.sendKeys("plan5");
	   Thread.sleep(200);
	   driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	   
	   
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
	   
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-lg']")).click();
	   
	   
	   driver.quit();
	   
	   
	   
  }
}
