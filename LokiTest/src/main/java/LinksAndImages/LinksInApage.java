package LinksAndImages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.bcel.generic.GETSTATIC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import mx4j.tools.remote.http.HTTPConnection;

public class LinksInApage {
	WebDriver driver1;
	
	@BeforeTest
	
	
	
	public void setup () {
		
		WebDriverManager.chromedriver().setup();
		driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.google.com/search?q=youtube&oq=you&aqs=chrome.0.0j69i57j69i60l3j0.710j0j8&sourceid=chrome&ie=UTF-8");
		
	}
	
	@Test
	public void findlinks() {
		
		List<WebElement> aa = driver1.findElements(By.tagName("a"));
		int sizes = aa.size();
		System.out.println("The size of the links: "+sizes); 
		for (WebElement webElements : aa) {
			System.out.println("The list of links are"+ aa +" Ok");
			String url = webElements.getAttribute("href");
			
			verifyTheLink(url);
		}
		System.out.println("launching the website.");
		
	}

	public static void verifyTheLink(String url1) {
		
		try {
			URL urlss = new URL(url1);
			
				HttpURLConnection httpurlconnection = (HttpURLConnection) urlss.openConnection();
				httpurlconnection.setConnectTimeout(3000);
				httpurlconnection.connect();
				
				if(httpurlconnection.getResponseCode()== 200) {
					System.out.println(url1 + "-" + httpurlconnection.getResponseMessage());
				}
				else {
					System.out.println(url1 + "-" + httpurlconnection.HTTP_NOT_FOUND );
				}
	
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
