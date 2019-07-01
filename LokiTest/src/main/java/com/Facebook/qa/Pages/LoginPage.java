package com.Facebook.qa.Pages;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Facebook.qa.Base.TestBase;


public class LoginPage extends TestBase {
	
	   //PageFactory-->OR 
    @FindBy(xpath="//a[@role='button'][@class='_42ft 4jy0 signup_btn 4jy4 4jy2 selected 51sy']")
    WebElement CreateNewAccountSignupBtn;
    @FindBy(xpath="//input[@name='email']")
    WebElement username;
    @FindBy(xpath="//input[@name='pass']")
    WebElement password;
    @FindBy(id="loginbutton")
    WebElement loginBtn;
    @FindBy(xpath="//a[@id='forgot-password-link']")
    WebElement forgotpasswordlink;
    @FindBy(xpath="//a[@role='button'][@class='_42ft 4jy0 4jy6 4jy2 selected 51sy']")
    WebElement CreateNewAccount;
    @FindBy(xpath="//*[@id='blueBarDOMInspector']/div/div[1]/div/div/h1/a/i)")
    WebElement FacebookLogo;
public LoginPage() throws IOException {
super();
// TODO Auto-generated constructor stub
PageFactory.initElements(driver, this);
}
public static  String validateloginPageTitle()
{
return driver.getTitle();
}
public boolean validateFacebookLogo()
{
return FacebookLogo.isDisplayed();
}
public String login(String un,String pwd)
{
username.sendKeys(un);
password.sendKeys(pwd);
loginBtn.click();
return new String();
}
}



