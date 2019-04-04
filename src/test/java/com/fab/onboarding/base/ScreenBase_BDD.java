package com.fab.onboarding.base;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ScreenBase_BDD {
	
	
	public static AndroidDriver<AndroidElement> driver;
	
	public ScreenBase_BDD(AndroidDriver<AndroidElement> driver){
		
		ScreenBase_BDD.driver = driver;
		loadElements();
	}


	public void loadElements(){
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
}
