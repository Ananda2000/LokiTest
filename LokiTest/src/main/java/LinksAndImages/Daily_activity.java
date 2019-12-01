package LinksAndImages;


import java.io.File;
import java.io.IOException;
import java.sql.DriverAction;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Daily_activity {
	
@Test
		public void fb_login_dataprovider() {
	
	WebDriver driver;
	WebDriverManager.chromedriver().clearPreferences();
	WebDriverManager.chromedriver().setup();
	Reporter.log("Launching the browser");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	Reporter.log("Maximizing the window");
	try {
		Thread.sleep(50);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//driver.get("https://lumentum.quickbase.com/db/bf94cth8m?a=q&qid=108");
	driver.get("https://lumentum.quickbase.com/db/main?a=SignIn");
	Reporter.log("inserting the url");
	driver.findElement(By.xpath("//input[@name='loginid' and @class ='UserInput WithPadding' ]")).clear();
	driver.findElement(By.xpath("//input[@name='loginid' and @class ='UserInput WithPadding' ]")).sendKeys("lakshmi.rakesh@athenatec.com");
	Reporter.log("Inserting the user name :");
	driver.findElement(By.xpath("//input[@name='password' and @class ='UserInput WithPadding' ]")).clear();
	driver.findElement(By.xpath("//input[@name='password' and @class ='UserInput WithPadding' ]")).sendKeys("laks#1949");
	
	
	driver.findElement(By.id("signin")).click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//a[@data-original-title='WIP']")).click();
	
	//driver.findElement(By.xpath("//div[@data-original-title='WIP' and @class='SelectedTableInd Tipsified']")).click();
	
	driver.findElement(By.xpath("//a[@href='/db/bf94cth8m?a=td']//div[@data-original-title='WIP']")).click();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//a[@class='Tipsified' and @data-original-title='Export/Archive &lt;= Yesterday']")).click();
	driver.findElement(By.xpath("//a[@href='/db/bf94cth8m?a=q&qid=108']")).click();
	
	//driver.findElement(By.xpath("//span[text()='More']")).click();
	
	//driver.findElement(By.xpath("//a[@id='vexpss' and @href='bf94cth8m?a=q&qid=108&dlta=xs%7E&ridlist=78']")).click();
	driver.findElement(By.linkText("More")).click();

	driver.findElement(By.linkText("Save as a spreadsheet")).click();
	
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	
	driver.findElement(By.linkText("Delete all records in this report")).click();
	
	TakesScreenshot scrshot = ((TakesScreenshot)driver);
	File src =  scrshot.getScreenshotAs(OutputType.FILE);
	
			File des = new File("C:\\Anand"+System.currentTimeMillis()+".png");
			try {
				FileUtils.copyFile(src, des);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
	
	
		
	}
}
