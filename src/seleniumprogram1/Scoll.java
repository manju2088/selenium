package seleniumprogram1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scoll {
     static WebDriver driver;
     
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\web driver\\chromedriver.exe");
		 driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");
		// double d=10.6
		//int i=(int)d
		WebElement watch=driver.findElement(By.xpath("//a[@class='action-button']"));
		
		
		JavascriptExecutor jr=((JavascriptExecutor)driver);
	
		//jr.executeScript("argument[0].scrollintoView();", action-button);
		jr.executeScript("window.scrollBy(0,500");
		
		
	}
}
