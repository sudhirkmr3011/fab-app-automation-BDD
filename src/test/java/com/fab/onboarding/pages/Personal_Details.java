package com.fab.onboarding.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fab.onboarding.base.ScreenBase_BDD;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Personal_Details extends ScreenBase_BDD{

public Personal_Details(AndroidDriver<AndroidElement> driver){
		
		super(driver);
	}
	




@AndroidFindBy(id="com.fabbank.dev:id/title")
public WebElement title;

@AndroidFindBy(id="com.fabbank.dev:id/negative")
public WebElement negative;

@AndroidFindBy(id="com.fabbank.dev:id/check_fullname_id")
public WebElement check_full_name;

@AndroidFindBy(id="com.fabbank.dev:id/edit_fullname_id")
public WebElement edit_full_name;

@AndroidFindBy(id="com.fabbank.dev:id/next_btn")
public WebElement next_button;


public Personal_Details error_title() throws InterruptedException{
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fabbank.dev:id/title")));
	//Thread.sleep(7000);
	System.out.println(title.getText());
	
	return this;
	
}

public Personal_Details error_title1() throws InterruptedException{
	
	System.out.println(negative.getText());
	negative.click();
	new TouchAction(driver).press(300,200).moveTo(300,100).release().perform();
	return this;
	
}


public Personal_Details fullname(){
	
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fabbank.dev:id/check_fullname_id")));
	
	check_full_name.click();
	negative.click();
	
	WebDriverWait wait1 = new WebDriverWait(driver,20);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fabbank.dev:id/edit_fullname_id")));
	
	edit_full_name.click();
	Actions action = new Actions(driver);
	

	
	action.sendKeys("Sudhir Kumar").perform();
	
	driver.pressKeyCode(AndroidKeyCode.BACK);
	
	return this;
	
}

public Contacts_Page nexbutton() throws InterruptedException{
	
	next_button.click();
	//Thread.sleep(10000);
	return new Contacts_Page(driver) ;
	
	
	
}
	
}

