package project_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;
	   
	 
    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
       
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms/");
    }
    @Test
    public void title() {
  	String  titleoffirrstbox= driver.findElement(By.xpath("//h3[@class='uagb-ifb-title']")).getText();
  	 System.out.println("title of first box is "+titleoffirrstbox); 
  	 //assert
  	 Assert.assertEquals(titleoffirrstbox, "Actionable Training" );
    }
    
    @AfterClass
    public void afterClass() {
  	  
  	  driver.close();
    }
}
