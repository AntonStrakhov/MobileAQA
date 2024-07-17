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
        //capabilities.setCapability(MobileCapabilityType.APP, "Users/astonuser/IdeaProjects/Tutorial/src/LongTap.app");
        IOSDriver driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        //capabilities for real device
//        d.setCapability("xcodeOrgId","xxxxxxxx");
//        d.setCapability("xcodeSigningId","iPhone Developer");
//        d.setCapability("udid","xxxxxxxx");
//        d.setCapability("updateWDABundleId","xxxxxxx");
//        How to get the xcodeOrgId?
//                It is TeamID  generated by Apple.You can find your Team ID using your developer account. Sign in to developer.apple.com/account, and click Membership in the sidebar.
//                Your Team ID appears in the Membership Information section under the team name
//
//        How to get udid?
//        https://www.wikihow.com/Obtain-the-Identifier-Number-(UDID)-for-an-iPhone,-iPod-or-iPad

//        What is updateWDABundleId?
//                Often we need provisioning profile from Apple to run the apps on Real Devices.And this Provisioning Profile generates Bundle ID
//        And we need to Sign the App to run on the device using Bundle id.

        return driver;
    }
}
