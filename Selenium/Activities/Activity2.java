package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		String url ="https://www.training-support.net";
		driver.get(url);
		String title=driver.getTitle();
		System.out.println("Title is " +title);
      WebElement idlocator=driver.findElement(By.id("about-link"));
      String txt=idlocator.getText();
		System.out.println("Text is " +txt);
		//find by class name
		WebElement classnamelocator=driver.findElement(By.className("green"));
		System.out.println("Text using class " +classnamelocator.getText());
		
		//find by link text
		WebElement linkText=driver.findElement(By.linkText("About Us"));
		System.out.println("Text using plinktext is " +linkText.getText());
		
		//find by using css selector
		
		WebElement cssselector=driver.findElement(By.cssSelector("a#about-link"));
		System.out.println("Text using css selector is " +cssselector.getText());
		
      driver.close();
	}

}
