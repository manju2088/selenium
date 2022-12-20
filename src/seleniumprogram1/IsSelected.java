package seleniumprogram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://demoqa.com/radio-button");
	
		WebElement yes=driver.findElement(By.xpath("//input[@id='yesRadio']"));
		Thread.sleep(2000);
		if(yes.isSelected()==true)
		{
			System.out.println("Element is selected");
		}
		else
		{
			System.out.println("Element is not selected");
		}
	
		if(yes.isDisplayed()==true)
		{
			System.out.println("Element is displyed");
		}
		else
		{
			System.out.println("Element is not displayed");
		}
	
	}

}
