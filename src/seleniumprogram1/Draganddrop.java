package seleniumprogram1;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\web driver\\chromedriver.exe");
		 driver=new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
		//take the screenshot and convert into file type
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//take the path of the particular folder to store the screenshot
		
		File dest= new File("C:\\Users\\DELL\\Desktop\\screen s\\newss"+LocalDate.now()+".jpg");
		//copy the file from source to destination
		FileUtils.copyFile(source, dest);
		

	}

}
