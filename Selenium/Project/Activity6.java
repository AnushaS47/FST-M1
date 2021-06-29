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

public class Activity6 {
	WebDriver driver;
	 WebDriverWait wait;
	 
  @BeforeClass
  public void beforeClass() {
      driver = new FirefoxDriver();
     
      
      //Open browser
      driver.get("https://alchemy.hguy.co/lms/");
     
  }
  @Test(priority=1)
  public void account()  {
  	 
  WebElement myacc=driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/my-account/']"));
  myacc.click();
	String newtitle=driver.getTitle();
	System.out.println("new page title is " +newtitle);
	//assert
	Assert.assertEquals(newtitle, "My Account – Alchemy LMS");
	
  }
  @Test(priority=2)
  public void login()  {
  	 
  driver.findElement(By.xpath("//div[2]/div[2]/div[2]/div[2]/a")).click();
  
	//driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
	driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
	WebElement pwd=driver.findElement(By.xpath("//input[@id='user_pass']"));
	pwd.sendKeys("pa$$w0rd");
	driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
  

	//wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath("//span[@class='display-name']"), "root"));
String conformation=driver.findElement(By.xpath("//span[@class='display-name']")).getText();
	//System.out.println("login conform "+conformation);
	
	  
Assert.assertEquals(conformation, "root");
	
  }
  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }
 
}
