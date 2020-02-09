package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class pojo2 extends BaseClass {
	public pojo2() {
		PageFactory.initElements(driver,this);
}
	@FindBy(id="radiobutton_0")
	private WebElement getRadio;
	
	@FindBy(id="continue")
	private WebElement getclick;

	public WebElement getGetRadio() {
		return getRadio;
	}

	public WebElement getGetclick() {
		return getclick;
	}
	
}