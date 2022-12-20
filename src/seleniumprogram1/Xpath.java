package seleniumprogram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
		WebElement emailid =driver.findElement(By.xpath("//input[@id=\'email\']"));
		emailid.sendKeys("manju");
		
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("meena");
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		Thread.sleep(2000);
		
			}

}
