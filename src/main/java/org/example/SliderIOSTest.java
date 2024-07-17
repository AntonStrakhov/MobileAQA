package org.example;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.testng.Assert;

import java.net.MalformedURLException;

public class SliderIOSTest extends BaseIOSTest{

    public static void main(String[] args) throws MalformedURLException {

        IOSDriver driver = DesiredCapabilities();

        driver.findElementByAccessibilityId("Sliders").click();
        IOSElement slider = (IOSElement) driver.findElementByXPath("//XCUIElementTypesSlider");
        slider.setValue("0%");
        slider.setValue("1%"); // from 0 to 1, 1% = 100% in slider, 0.5%=50% in slider
        Assert.assertEquals("100%", slider.getAttribute("value"));
    }
}
