package org.example;

import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.util.HashMap;

public class ScrollIOSTest extends BaseIOSTest {

    public static void main(String[] args) throws MalformedURLException {

        IOSDriver driver = DesiredCapabilities();

        //scroll
        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        scrollObject.put("name", "Web View");
        driver.executeScript("mobile:scroll", scrollObject);
        driver.findElementByAccessibilityId("Web View").click();

        driver.findElementByXPath("//XCUIElementTypeButton[name='UIKitCatalog']").click();
        driver.findElementByAccessibilityId("Picker View").click();

        //picker wheels
        driver.findElementByAccessibilityId("Red color component value").sendKeys("80");
        driver.findElementByAccessibilityId("Green color component value").sendKeys("220");
        driver.findElementByAccessibilityId("Blue color component value").sendKeys("105");
    }
}
