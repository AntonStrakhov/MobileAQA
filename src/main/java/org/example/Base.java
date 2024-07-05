package org.example;

import io.appium.java_client.Setting;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Base {
    public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver;

        File appDir = new File("src");
        File app = new File(appDir, "ApiDemos-debug.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        if(device.equals("emulator")) {
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "ANSTR50");
        }
        else if (device.equals("real")) {
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
            //to solve the problem of slow searching on real devices
            capabilities.setCapability(String.valueOf(Setting.WAIT_FOR_IDLE_TIMEOUT), 100);
            capabilities.setCapability(AndroidMobileCapabilityType.SKIP_DEVICE_INITIALIZATION, "true");
            capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        }
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");//new step
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        return driver;
    }
}