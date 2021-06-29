package project_Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
   
 
    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
       
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms/");
    }
  @Test
  public void test() {
	  String title= driver.getTitle();
		 System.out.println("Title is " +title);
		  Assert.assertEquals(title,"Alchemy LMS – An LMS Application");
  }
  
  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }
  
}
