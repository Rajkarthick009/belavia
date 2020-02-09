package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pages.pojo;
import com.pages.pojo1;
import com.pages.pojo2;
import com.pages.pojo3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	pojo3 m ;
	pojo1 s;
	@Given("user need to get the booking id")
	public void user_need_to_get_the_booking_id1() {
	launchBrowser();
	maxi();
	Loadurl("https://adactin.com/HotelApp/");
	
	}
	@When("user need to enter the {string} and {string} click the login button")
	public void user_need_to_enter_the_and_click_the_login_button(String S1, String S2) {
		pojo p=new pojo();
		usrname(p.getUserloc(),S1);
		
		usrname(p.getPassloc(),S2);
		btnclick(p.getGetButton());
	}

	@When("user need to select the hotel availablity {string}, {string}, {string}, {string},{string},{string} and click the search")
	public void user_need_to_select_the_hotel_availablity_and_click_the_search(String S3, String S4, String S5, String S6, String S7, String S8) {
		 s = new pojo1();
		 
		selectvalue(s.getLocation(),S3);
		selectvalue(s.getHotel(),S4);
		selectvalue(s.getRoomType(),S5);
		selectvalue(s.getRoomno(),S6);
		selectvalue(s.getAdultroom(),S7);
		selectvalue(s.getChildroom(),S8);
			btnclick(s.getSumitButton());
		
		}


	@When("User Can Select the Hotel On click the radio Button")
	public void user_Can_Select_the_Hotel_On_click_the_radio_Button() {
		pojo2 r = new pojo2();
		btnclick(r.getGetRadio());
		btnclick(r.getGetclick());

	}

	@When("User now Book A Hotel With {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} Payment")
	public void user_now_Book_A_Hotel_With_and_and_and_and_and_and_and_Payment(String R1, String R2, String R3, String R4, String R5, String R6, String R7, String R8) throws InterruptedException {
		 m = new pojo3();
		usrname(m.getFirst(),R1);
		usrname(m.getLast(),R2);
		usrname(m.getAddre(),R3);
		usrname(m.getCrdno(),R4);
		selectvalue(m.getCrdtyp(),R5);
		selectvalue (m.getExemonth(),R6);
		selectvalue(m.getExpyear(),R7);
		usrname(m.getCvv(),R8);
		btnclick(m.getBookButton());

		Thread.sleep(5000);
		WebElement coupon = m.getCoupon();
		String text = coupon.getAttribute("value");
		 System.out.println(text);
			

		}

@Then("after got the booking id user need to click the logout")
public void after_got_the_booking_id_user_need_to_click_the_logout() {
	btnclick(m.getGetlogout());
}



	
}