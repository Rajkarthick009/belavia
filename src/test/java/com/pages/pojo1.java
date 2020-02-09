package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class pojo1 extends BaseClass {
	public pojo1() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="location")
	private WebElement location	;

	@FindBy(id="hotels")
	private WebElement hotel;

	@FindBy(id="room_type")
	private WebElement RoomType;
	
	@FindBy(id="room_nos")
	private WebElement Roomno;
	
	@FindBy(id="adult_room")
	private WebElement adultroom;

	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement SumitButton;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getRoomno() {
		return Roomno;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSumitButton() {
		return SumitButton;
	}
	
}
