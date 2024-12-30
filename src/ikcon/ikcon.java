package ikcon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class ikcon {
	
		public static WebDriver driver;
		public static void main(String[] args) throws InterruptedException
		{
			driver=new ChromeDriver();
			driver.get("https://www.ikcontech.com/");
			//Thread.sleep(30000);
			
			driver.manage().window().maximize();
			
			
			driver.findElement(By.xpath("//a[@ id='hs-eu-decline-button']")).click();
			
			
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementsByTagName('a')[8].click()");
			
			 	
	        }

			
			
		

	}


