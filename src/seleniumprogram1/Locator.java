package seleniumprogram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
		WebElement email =driver.findElement(By.id("email"));
		email.sendKeys("manju");
		
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("dfhjj");
		Thread.sleep(2000);

		WebElement loginbutton=driver.findElement(By.name("login"));
		loginbutton.click();
		
		Thread.sleep(2000);
		WebElement forgotpasslink=driver.findElement(By.linkText("Forgotten password?"));
		forgotpasslink.click();
		driver.navigate().to("https://www.google.co.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		

	}

}
