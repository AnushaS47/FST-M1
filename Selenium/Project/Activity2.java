package project_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;
	   
	 
    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
       
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms/");
    }
    
    @Test
    public void header() {
  	String  Header= driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText();
  	 System.out.println("Header is "+Header); 
  	 //assert
  	 Assert.assertEquals(Header, "Learn from Industry Experts" );
    }
    
    @AfterClass
    public void afterClass() {
  	  
  	  driver.close();
    }
}
