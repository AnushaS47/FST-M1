package project_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity8 {
	WebDriver driver;
	   
	 
    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
       
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms/");
    }
    
    @Test
    public void contact() {
    	
    	driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/contact/']")).click();
    	driver.findElement(By.xpath("//input[@id='wpforms-8-field_0']")).sendKeys("Anusha");
        driver.findElement(By.xpath("//input[@id='wpforms-8-field_1']")).sendKeys("anushas2403@gmail.com");
        driver.findElement(By.xpath("//textarea[@id='wpforms-8-field_2']")).sendKeys("doing Activity8");
        driver.findElement(By.xpath("//button[@id='wpforms-submit-8']")).click();
       String  conformmessage=driver.findElement(By.xpath("//div[2]/div[2]/div[2]/div[2]/p")).getText();
      System.out.println("message after submission: "+conformmessage);
    }
    
    @AfterClass
    public void afterClass() {
  	  
  	  driver.close();
    }
}
