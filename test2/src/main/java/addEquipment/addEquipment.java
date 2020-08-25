package addEquipment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class addEquipment  {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver;
	  
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\devops\\testng\\chromedriver.exe");
	   driver=new ChromeDriver();
	   
	   driver.get("http://13.127.16.30");
	   
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
	   
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//button[contains(text(),'Add Equipment')]")).click();
	   
	   WebElement equipment_name,count;
	   
	   
	   equipment_name=driver.findElement(By.xpath("//input[@id='name']"));
	   count=driver.findElement(By.xpath("//input[@id='count']"));
	   Thread.sleep(200);
	   equipment_name.click();
	   Thread.sleep(500);
	   equipment_name.sendKeys("equip1");
	   
	  
	   Thread.sleep(500);
	   count.click();
	   Thread.sleep(500);
	   count.sendKeys("20");
	   
	   Thread.sleep(200);
	   
	   driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	   
	   
	   driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
	   
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//button[contains(text(),'Add Equipment')]")).click();
	   
	  
	   equipment_name=driver.findElement(By.xpath("//input[@id='name']"));
	   count=driver.findElement(By.xpath("//input[@id='count']"));
	   
	   Thread.sleep(200);
	   equipment_name.click();
	   Thread.sleep(500);
	   equipment_name.sendKeys("equip2");
	   
	  
	   Thread.sleep(500);
	   count.click();
	   Thread.sleep(500);
	   count.sendKeys("10");
	   
	   Thread.sleep(200);
	   
	   driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	   
	   
	   
	  
	   Thread.sleep(5000);
	   
	   driver.quit();
  }
}
