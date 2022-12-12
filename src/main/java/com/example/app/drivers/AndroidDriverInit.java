package com.example.app.drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverInit {

    public static AndroidDriver<AndroidElement> driver;

    public static void initialization(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","12");
        caps.setCapability("automationName","UIAutomator2");
        caps.setCapability("apps","\"D:\\TIC\\Kampus Merdeka\\MSIB\\Studi Independen\\Alterra\\Capstone\\app-release.apk\"");

        try{
            driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

    public static void close(){
        driver.quit();
    }
}