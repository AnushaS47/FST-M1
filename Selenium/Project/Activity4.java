package project_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {
	WebDriver driver;
	   
	 
    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
       
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms/");
    }
    @Test
    public void title() {
  	String  populorcourse= driver.findElement(By.xpath("//div/div[2]/article/div[2]/h3")).getText();
  	 System.out.println(" the second most popular course is  "+populorcourse); 
  	 //assert
  	 Assert.assertEquals(populorcourse, "Email Marketing Strategies" );
    }
    
    @AfterClass
    public void afterClass() {
  	  
  	  driver.close();
    }
}
