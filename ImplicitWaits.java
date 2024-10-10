package Syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaits {


//here there are 3 types of wait implicit explicit,fluent waits
	//theread.sleep is when we give the certain time of seconds even if the next application
	//page is ready also it will wait the time we gave
	public static void main(String[] args) {
		
		//implicit wait is the global wait
		WebDriver driver= new ChromeDriver();
		 //here we are giving time and implicit wait and duration of the wait can also be
		 //written anywhere in the programme.
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//if we give the wrong xpath it will wait for the time we give and then throws the error 
		 //it will apply for the all the webelements and search 
		driver.get("https://practice.expandtesting.com/");
		WebElement text=driver.findElement(By.xpath("//input[@type='text']"));
		 text.sendKeys("radio");
		 //text.sendKeys(Keys.ENTER);
		 
//we need to create the dynamic wait because we dont know how much tym its gonna take
		 
			System.out.println("hello");

		WebElement path=driver.findElement(By.xpath("//a[@href='/radio-buttons']"));
				path.click();
	WebElement home =driver.findElement(By.xpath("//a[text()='Home']"));
                home.click();
		
		
		
	}
	
}
