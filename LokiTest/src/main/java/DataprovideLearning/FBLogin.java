package DataprovideLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBLogin {
	
@DataProvider 
    public Object[][] Authentication() throws Exception{
 
         Object[][] testObjArray = xlprovider.getTableArray("C://Anand//WS_2018-09//LokiTest//src//main//java//testData//login.xlsx","Sheet1");
 
         return (testObjArray);
 
 }
	
	@Test(dataProvider="Authentication")
	public void fb_login_dataprovider(String un, String pw) {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		System.out.println("User name : -"+un);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(un);
		System.out.println("The password:-"+pw);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(pw);
		
		driver.findElement(By.xpath("//input [@value='Log In']")).click();
		
		
		
	}

}
