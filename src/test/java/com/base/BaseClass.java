package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
public static WebDriver driver;
	public static void launchBrowser() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\karthiabi\\org.test\\driver\\chromedriver.exe" );
driver=new ChromeDriver();
}	
public static void Loadurl(String load) {
driver.get(load);
}
public static void usrname(WebElement user , String uname) {
user.sendKeys(uname);
}
public static void maxi() {
	driver.manage().window().maximize();
}
public static void btnclick(WebElement btn ) {
	btn.click();
	}
public static void selectvalue (WebElement e,String valu) {
	Select s = new Select(e);
	s.selectByValue(valu);
	}
public static void out() {
	driver.quit();	
}


}


