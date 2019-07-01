package com.Facebook.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Facebook.qa.Base.TestBase;
import com.Facebook.qa.Pages.LoginPage;

public class LoginPageTest extends TestBase {

	
	LoginPage loginPage;
    //homePage homePage;  
public LoginPageTest() throws IOException {
super();
// TODO Auto-generated constructor stub

    }
    
@BeforeMethod
public void Setup() throws IOException
{
Initialization();
loginPage=new LoginPage();
}
@Test(priority=1)
public void validateloginPageTitleTest()
{
String title=LoginPage.validateloginPageTitle();
Assert.assertEquals(title, "Log in to Facebook");
}
@Test(priority=2)	
public void FacebookLogoTest()
{
boolean flag=loginPage.validateFacebookLogo();
Assert.assertTrue(flag);
}
@Test(priority=3)
public void loginTest()
{
loginPage.login(prop.getProperty("username"),prop.getProperty("password"));	
}
@AfterMethod()
public void tearDown()
{
driver.quit();
}	
}
