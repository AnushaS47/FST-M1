package project_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Activity5 {
	WebDriver driver;
	 WebDriverWait wait;
	 
    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
       
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms/");
       
    }
    @Test
    public void account()  {
    	 
    WebElement myacc=driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/my-account/']"));
    myacc.click();
	String newtitle=driver.getTitle();
  	System.out.println("new page title is " +newtitle);
  	Assert.assertEquals(newtitle, "My Account – Alchemy LMS");
  	
 }
    
    @AfterClass
    public void afterClass() {
  	  
  	  driver.close();
    }
}
