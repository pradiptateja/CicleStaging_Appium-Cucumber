package stepDefinition;

import config.setUp;
import helper.devices;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class hook extends setUp {

    devices devices = new devices();

    @Before
    public void Before() throws MalformedURLException, InterruptedException {
        desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:appPackage", "staging.cicle");
        desiredCapabilities.setCapability("appium:appActivity", "staging.cicle.MainActivity");
        desiredCapabilities.setCapability("platformName", "Android");
        devices.deviceList(desiredCapabilities,devicesUsed);

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(remoteUrl, desiredCapabilities);

        Thread.sleep(threadSleepOpeningApplication);
    }

    @After
    public void After() {
        driver.quit();
    }
}
