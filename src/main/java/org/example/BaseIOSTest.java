package org.example;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseIOSTest {

    public static IOSDriver DesiredCapabilities () throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.2");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12 Pro");
        //IOS_XCUI_Test APPLE
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 500000);
        capabilities.setCapability("commandTimeouts", "12000");

        capabilities.setCapability(MobileCapabilityType.APP, "Users/astonuser/IdeaProjects/Tutorial/src/UIKitCatalog.app");
        IOSDriver driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        return driver;
    }
}
