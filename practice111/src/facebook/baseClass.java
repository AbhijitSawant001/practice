package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class baseClass 
{
 public static void main(String[] args) throws InterruptedException {

	 System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\AUTOMATION TESTING\\notepad notes\\selenium\\chromedriver_win32\\chromedriver.exe");
	 ChromeOptions options=new ChromeOptions();
	 options.addArguments("--disable-notifications");
	 WebDriver driver=new ChromeDriver(options);	
	 
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sawantabhijit001@gmail.com");
	 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("a2244548a");
	 driver.findElement(By.xpath("//button[@name='login']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("(//span[contains(@class,'x4k7w5x')])[7]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//span[contains(@class,'x193iq5w')])[51]")).click();
	 Thread.sleep(5000);
	 driver.quit();
	 
	 
}
}
