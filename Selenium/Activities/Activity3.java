package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
	
WebDriver driver= new FirefoxDriver();
driver.get("https://training-support.net/selenium/simple-form");
String title =driver.getTitle();
System.out.println("Title is " +title);

WebElement Firestname=driver.findElement(By.id("firstName"));
System.out.println("first name is " +Firestname);

WebElement Lastname=driver.findElement(By.id("lastName"));
System.out.println("last name is " +Lastname);

//send keys
Firestname.sendKeys("Anusha");
Lastname.sendKeys("S");

WebElement Email=driver.findElement(By.id("email"));
System.out.println("Email is " +Email);
Email.sendKeys("xyzh777@gmail.com");

WebElement Contactnum=driver.findElement(By.id("number"));
System.out.println("Contact number is " +Contactnum);
Contactnum.sendKeys("898888889");

WebElement Submitbutton=driver.findElement(By.cssSelector(".ui.green.button"));


Submitbutton.click();
System.out.println("clicking on submit button " +Submitbutton);

//driver.findElement(By.cssSelector(".ui.green.button")).click();

driver.close();


	}

}
