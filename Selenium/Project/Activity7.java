package project_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;
	   
	 
    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
       
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms/");
    }
    
    @Test
    public void numberofcourses() {
    	
    	driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/all-courses/']")).click();
  	int numberofcourses=  driver.findElements(By.xpath("//h3[@class='entry-title']")).size();
  	 System.out.println("total number of courses available "+numberofcourses);
  	Assert.assertEquals(numberofcourses, 3);
    }
    
    @AfterClass
    public void afterClass() {
  	  
  	  driver.close();
    }
}
