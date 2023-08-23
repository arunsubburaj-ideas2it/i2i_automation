package iomd_stepdef;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloudfareTesting {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//https://www.iomd.info
		//https://node-iomd-810be0f8a309740a55157f50678d6.webflow.io/
		driver.get("https://IOMD:IOMDletmein@www.iomd.info");
		
		driver.get("https://IOMD:IOMDletmein@www.iomd.info/");
		WebElement findElement = driver.findElement(By.xpath("//input[@data-name='Contact 1 Email']"));
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", findElement);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='Contact-1-Email']")).sendKeys("test@test.com");
      //  driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
        Thread.sleep(3000);
        //driver.switchTo().alert().accept();
       // driver.findElement(By.xpath("//input[@name='Contact-1-Email']")).clear();
       // driver.findElement(By.xpath("//input[@name='Contact-1-Email']")).sendKeys("test@test.com");
       // driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
       // Thread.sleep(3000);
       // driver.switchTo().alert().accept();cf-chl-widget-9glu0
       driver.switchTo().frame("cf-chl-widget-y5ihc");
       driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//        Thread.sleep(3000);
//        driver.switchTo().alert().accept();
        Thread.sleep(4000);     
        driver.findElement(By.xpath("//input[@name='Contact-1-Email']")).clear();
        
        driver.findElement(By.xpath("//input[@name='Contact-1-Email']")).sendKeys("test@test.com");
        driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
       // driver.switchTo().frame(1);
       // driver.findElement(By.xpath("//input[@type='checkbox']")).click();

       driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
				
	}

}
