package com.nba.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nba.stepdefinition.Hook;


public class Customer {
public Customer()
{
	PageFactory.initElements(Hook.driver, this);
}
@FindBy(xpath="//label[text()='Done']")
private WebElement btn1;

@FindBy(id="fname")
private WebElement fnm;

@FindBy(id="lname")
private WebElement lnm;

@FindBy(id="email")
private WebElement mail;

@FindBy(xpath="//textarea[@id='message']")
private WebElement address;

@FindBy(id="telephoneno")
private WebElement phno;


@FindBy(xpath="//input[@type='submit']")
private WebElement subtn;


public WebElement getBtn1() {
	return btn1;
}

public WebElement getFn() {
	return fnm;
}

public WebElement getLn() {
	return lnm;
}

public WebElement getMail() {
	return mail;
}

public WebElement getAddress() {
	return address;
}

public WebElement getPhno() {
	return phno;
}

public WebElement getSubmitbtn() {
	return subtn;
}

}


