package seleniumprogram1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {

public static void main(String[] args)  {
System.setProperty("webdriver.chrome.driver","C:\\selenium\\web driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");


	}

}
