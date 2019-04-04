package com.fab.onboarding.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.fab.onboarding.base.ScreenBase_BDD;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Contacts_Page extends ScreenBase_BDD{

	public Contacts_Page(AndroidDriver<AndroidElement> driver) {
		super(driver);
		
	}
	
	
	
	@AndroidFindBy(id="com.fabbank.dev:id/city_id")
	public WebElement city;


	@AndroidFindBy(id="com.fabbank.dev:id/next_btn")
	public WebElement next_button;
	
	
	public Contacts_Page city() throws InterruptedException{
		Thread.sleep(4000);
		MobileElement element =  driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0).className(\"android.widget.FrameLayout\")).getChildByText("
				+ "new UiSelector().className(\"android.widget.EditText\"), \"Additional Address Information (optional)\")"));
		//new TouchAction(driver).press(300,200).moveTo(300,100).release().perform();
		city.click();
		city.clear();
		Actions action3 = new Actions(driver);

		action3.sendKeys("Abu Dhabi").perform();
			
		driver.pressKeyCode(AndroidKeyCode.BACK);
		return this;
		
		
	}
	
	public Contacts_Page nextbutton(){
		
		next_button.click();
		return this;
		
		
	}

	
	

}
