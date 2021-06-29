package testNG_Activities;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;
	@BeforeClass
	
	  public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
	
  @Test
  public void test1() {
	  
	 String title= driver.getTitle();
	 System.out.println("Title is " +title);
	  Assert.assertEquals(title,"Target Practice");
  }
  @Test
  public void test2() {
	  
	
	 WebElement color=driver.findElement(By.xpath("//button[@class='ui black button']"));
	 System.out.println("color of the button is " +color);
	 Assert.assertEquals(color,"white");
  }
  
  @Test(enabled=false)
  public void test3() 
  {
	  
	
	 WebElement color=driver.findElement(By.xpath("//button[@class='ui teal button']"));
	 System.out.println("color of the button is " +color);
	 Assert.assertEquals(color,"white");
  }
  
  @Test
  public void test4() throws SkipException{
	  String condition="skip test";
  
	  if(condition.equals("skip test")) {
		  throw new SkipException("Skipping - This is not ready for testing ");
		  
	  }else {
	
	 WebElement color=driver.findElement(By.xpath("//button[@class='ui grey button']"));
	 System.out.println("color of the button is " +color);
	 Assert.assertEquals(color,"grey");
	  }
  }
  
  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }
  
}
