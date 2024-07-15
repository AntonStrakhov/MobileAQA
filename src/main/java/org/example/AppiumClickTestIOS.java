package org.example;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

public class AppiumClickTestIOS extends BaseIOSTest{

    public static void main(String[] args) throws MalformedURLException {

        IOSDriver driver = DesiredCapabilities();

        driver.findElementByAccessibilityId("Alert Views").click();

        //tagname[@attribute='value']

        driver.findElementByXPath("//XCUIElementTypeStaticText[@name='Text Entry']").click();
        driver.findElementByXPath("//XCUIElementTypeCell").sendKeys("Hello");
        driver.findElementByAccessibilityId("Ok").click();
        driver.findElementByAccessibilityId("Confirm / Cancel").click();

        System.out.println(driver.findElementByXPath("//*[contains(@name, 'message')]").getText());
        driver.findElementByAccessibilityId("Confirm").click();
    }
}
