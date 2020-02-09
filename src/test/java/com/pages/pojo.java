package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.BaseClass;

public class pojo extends BaseClass{
public pojo() {
	PageFactory.initElements(driver,this);
	
}
@FindBy(id="username")
private WebElement userloc;

@FindBy(id="password")
private WebElement passloc;

@FindBy(id="login")
private WebElement getButton;


@FindBy(id="login in")
private WebElement getButton1;

public WebElement getUserloc() {
	return userloc;
}
public WebElement getPassloc() {
	return passloc;
}
public WebElement getGetButton() {
	return getButton;
}
public WebElement getGetButton1() {
	return getButton1;
}



}
