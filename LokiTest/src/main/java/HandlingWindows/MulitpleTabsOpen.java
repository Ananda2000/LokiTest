package HandlingWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MulitpleTabsOpen {
	WebDriver ffDriver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		ffDriver= new ChromeDriver();
		ffDriver.manage().window().maximize();
	}
	
	
	  @Test
	  public void openSameUrlInMultipleTab() throws InterruptedException {
		  
		  String pageUrl = "http://www.bing.com";
		  this.ffDriver.get(pageUrl);
		  
		  String currWindowHandleStr = this.ffDriver.getWindowHandle();
		  System.out.println("Current windowhandler before create tab : " + currWindowHandleStr);
		  
		  /* Get html body webelement. */
		  WebElement bodyElement = this.ffDriver.findElement(By.tagName("body"));
		 
		  /* Send Ctrl+t to create newtab. */
		  for(int i=0;i<6;i++)
		  {
			  bodyElement.sendKeys(Keys.CONTROL + "t");
			  Thread.sleep(1000);
			  System.out.println("Open a newtab.");
		  }
		  
		 
		  /* Change tab 2 's page url tp http://www.google.com */
		  bodyElement.sendKeys(Keys.CONTROL+"2");
		  this.ffDriver.get("http://www.google.com");
		  Thread.sleep(3000);
		  
		  currWindowHandleStr = this.ffDriver.getWindowHandle();
		  System.out.println("Current windowhandler after go to tab 2 : " + currWindowHandleStr);
		  
		  /* Close tab 3.*/
		  /* First need to find the body web element in currenttab. */
		  bodyElement = this.ffDriver.findElement(By.tagName("body"));
		  /* Go to tab 3. */
		  bodyElement.sendKeys(Keys.CONTROL+"3");
		  this.ffDriver.get("http://www.twitter.com");
		  Thread.sleep(3000);
		  /* Close currenttab. */
		  bodyElement.sendKeys(Keys.CONTROL+"w");
		  Thread.sleep(3000);
	  }

}
