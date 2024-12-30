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
			
			/*//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement e=driver.findElement(By.xpath("//a[text()='Decline']"));
		    e.click();
			WebElement e1=driver.findElement(By.xpath("(//div[@class='nzVyrk'])[1]"));
			Actions ac=new Actions(driver);
			ac.moveToElement(e1).perform();
		
			 WebElement invisibleOption = driver.findElement(By.xpath("//nav[@id='comp-le6xamw0navContainer']/ul/li[1]/ul/li[3]/a"));
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].click();", invisibleOption);*/

			
	       
	     
	        	
	        }

			
			
		

	}


