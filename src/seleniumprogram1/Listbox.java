package seleniumprogram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {


		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\web driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();

			driver.get("https://www.amazon.in/");
			
			WebElement options=driver.findElement(By.xpath("//select[@title='Search in']"));
			
			Select s= new Select(options);
			Thread.sleep(2000);
			s.selectByIndex(1);
			
			Thread.sleep(2000);
			s.selectByValue("search-alias=mobile-apps");
			
			Thread.sleep(2000);
			s.selectByVisibleText("search-alias=beauty");

		}

}
