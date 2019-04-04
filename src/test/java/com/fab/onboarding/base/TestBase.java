package com.fab.onboarding.base;

import java.io.IOException;
import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.fab.onboarding.pages.Contacts_Page;
import com.fab.onboarding.pages.Personal_Details;
import com.fab.onboarding.utils.CommonUtils;


public class TestBase {
	

	public static AndroidDriver<AndroidElement> driver;
	public  static Contacts_Page contacts;
	public static  Personal_Details personal;

	public TestBase(){
		if(driver==null){
			
				try {
					CommonUtils.loadConfigProp("FAB.properties");
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				CommonUtils.setCapabilities();
				try {
					driver = CommonUtils.getDriver();
				} catch (MalformedURLException e) {
					
					e.printStackTrace();
				}
				}
	}
	
	

}
