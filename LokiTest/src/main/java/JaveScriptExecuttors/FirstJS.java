package JaveScriptExecuttors;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Document;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstJS {
	public static WebDriver driver;
JavascriptExecutor js;
	@BeforeMethod 
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	}
	

}
