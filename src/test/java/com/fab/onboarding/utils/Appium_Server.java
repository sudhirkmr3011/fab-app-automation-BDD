package com.fab.onboarding.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class Appium_Server {

	public static AndroidDriver driver;
	
	public static AppiumDriverLocalService service;
	
	
	
@Test
public static void start() throws InterruptedException, MalformedURLException {
	
	
		service=AppiumDriverLocalService.buildService(
				new AppiumServiceBuilder().usingDriverExecutable(new File("/usr/local/bin/node"))
				.withAppiumJS(new File("/Applications/Appium.app/Contents/Resources/app/node_modules/appium/build/lib/main.js"))
				.withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
				.withLogFile(new File(System.getProperty("user.dir")+"/src/test/resources/logs/Appium.log")));
		
		service.start();
		
		System.out.println("servicess" + service );
		if (service != null)
		{
           System.out.println("Appium server started");
        }
		
		
		//driver.quit();
		//service.stop();
		Thread.sleep(10000);
		
		System.out.println("servicess_stop" + service );
		if (service == null) {

			System.out.println("Appium server stop");

			}
	}

public static void process_kill() {
	try {  
	      String line;  
	      Process process = Runtime.getRuntime().exec("lsof -t -i :4723");
	          
	      BufferedReader input =new BufferedReader(new InputStreamReader(process.getInputStream()));  
	      while ((line = input.readLine()) != null) {  
	      System.out.println("Appium server is started on port :" + line);  
	      }  
	      input.close();  
	    }  
	    catch (Exception err) {  
	    	err.printStackTrace();  
	
}
}

}
