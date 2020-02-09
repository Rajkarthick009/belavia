package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class pojo3 extends BaseClass {public pojo3() {
	PageFactory.initElements(driver,this);
	
}

@FindBy(id="first_name")
private WebElement first ;

@FindBy(id="last_name")
private WebElement last;

@FindBy(id="address")
private WebElement addre;

@FindBy(id="cc_num")
private WebElement crdno;

@FindBy(id="cc_type")
private WebElement crdtyp;

@FindBy(id="cc_exp_month")
private WebElement exemonth;

@FindBy(id="cc_exp_year")
private WebElement expyear;

@FindBy(id="cc_cvv")
private WebElement cvv;


@FindBy(id="book_now")
private WebElement bookButton;

@FindBy(id="order_no")
private WebElement coupon;

@FindBy(xpath="//a[@href='Logout.php']")
private WebElement getlogout;

public WebElement getCoupon() {
	return coupon;
}

public WebElement getGetlogout() {
	return getlogout;
}


public WebElement getFirst() {
	return first;
}


public WebElement getLast() {
	return last;
}


public WebElement getAddre() {
	return addre;
}


public WebElement getCrdno() {
	return crdno;
}


public WebElement getCrdtyp() {
	return crdtyp;
}


public WebElement getExemonth() {
	return exemonth;
}


public WebElement getExpyear() {
	return expyear;
}


public WebElement getCvv() {
	return cvv;
}


public WebElement getBookButton() {
	return bookButton;
}








}
