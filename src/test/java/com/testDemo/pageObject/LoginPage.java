package com.testDemo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"_com_liferay_product_navigation_user_personal_bar_web_portlet_ProductNavigationUserPersonalBarPortlet_qfkd____\"]/span")
	@CacheLookup
	WebElement lnkSignin;
		
	@FindBy(name="_com_liferay_login_web_portlet_LoginPortlet_login")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="_com_liferay_login_web_portlet_LoginPortlet_password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(className="btn-default")
	@CacheLookup
	WebElement btnLogin;
	
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;
	
	
	public void clickSignin()
	{
		lnkSignin.click();
	}
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	public void clickLogin()
	{
		btnLogin.click();
	}	
	
	
}