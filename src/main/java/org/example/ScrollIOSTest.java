package org.example;

import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Objects;

public class ScrollIOSTest extends BaseIOSTest {

    public static void main(String[] args) throws MalformedURLException {

        IOSDriver driver = DesiredCapabilities();

        //scroll
        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        scrollObject.put("name", "Web View");

        driver.executeScript("mobile:scroll", scrollObject);
        driver.findElementByAccessibilityId("Web View").click();
    }
}
