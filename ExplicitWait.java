package Syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Explicit wait is applicable only for the particular webelement which we apply for

public class ExplicitWait {
	
	public static void main(String[] args) {
		
  
			
			//implicit wait is the global wait
			WebDriver driver= new ChromeDriver();
		
			 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//if we give the wrong xpath it will wait for the time we give and then throws the error 
			 //it will apply for the all the webelements and search 
			driver.get("https://practice.expandtesting.com/");
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
			 //text.sendKeys("radio");
			 //text.sendKeys(Keys.ENTER);
			 
	//we need to create the dynamic wait because we dont know how much tym its gonna take
//here we are directly giving the wait.until instead of storing it
			
WebElement path=wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//a[@class='my-link stretched-link']"))));	 
	//WebElement path=driver.findElement(By.xpath("//a[@class='my-link stretched-link']"));
					path.click();
			
		WebElement home =driver.findElement(By.xpath("//a[text()='Home']"));
	                home.click();
	
	
	
	
	
	
	
	
	
	}
}
