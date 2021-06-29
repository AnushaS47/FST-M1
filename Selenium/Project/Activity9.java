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

public class Activity9 {
	WebDriver driver;
	 WebDriverWait wait;
	 
 @BeforeClass
 public void beforeClass() {
     driver = new FirefoxDriver();
     wait = new WebDriverWait(driver, 10);
     
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
@Test(priority=3)
public void courses()  {
//clicking on all courses
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href ='https://alchemy.hguy.co/lms/all-courses/']")));
driver.findElement(By.xpath("//a[@href ='https://alchemy.hguy.co/lms/all-courses/']")).click();

//clicking on 1st course
//////wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='https://alchemy.hguy.co/lms/courses/social-media-marketing/']")));
driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[1]/article/div[2]/p[2]/a")).click();
//slecting firstcontent
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ld-item-title']")));
driver.findElement(By.xpath("//div[@class='ld-item-title']")).click();

	  
	System.out.println("title of the page is "+driver.getTitle());  

Assert.assertEquals(driver.getTitle(),"Developing Strategy – Alchemy LMS" );
}

 
 
	
@AfterClass
public void afterClass() {
	  
	  driver.close();
}
 

 }

