package seleniumprogram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804791&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9299648%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiA4OybBhCzARIsAIcfn9nrMnAF6YX-l4PRghvgGfEt4cZUes4yYKqJFLZ3iuukEr4OlLX0eVwaAi7OEALw_wcB");
		WebElement emailid =driver.findElement(By.xpath("//input[@name='firstname']"));
		emailid.sendKeys("manju");
		
		WebElement password=driver.findElement(By.xpath("//input[@name='lastname']"));
		password.sendKeys("meena");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("manjumore77@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("manjusha");
		
		WebElement options=driver.findElement(By.xpath("//select[@title='Day']"));
        
		 Select s=new Select(options);
		 s.selectByIndex(5);
		 
		 WebElement month=driver.findElement(By.xpath("//select[@title='Month']"));
		 Select s1=new Select(month);
	       s1.selectByValue("June") ;
	       
	     //  WebElement year=driver.findElement(By.xpath("//select[@title='Year']"));
			// Select s2=new Select(year);
		     //  s2.selectByValue("2015") ;
		       
	}

}
