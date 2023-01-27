package helper;

import config.setUp;
import org.openqa.selenium.remote.DesiredCapabilities;

public class devices extends setUp {

    public void deviceList (DesiredCapabilities desiredCapabilities, String devices) {
        if (devices == device[0]) {
            desiredCapabilities.setCapability("appium:deviceName", "Redmi");
            desiredCapabilities.setCapability("appium:udid", "d37a9b7e7cf5");
        } else if (devices == device[1]) {
            desiredCapabilities.setCapability("appium:deviceName", "MyAVD");
            desiredCapabilities.setCapability("appium:udid", "emulator-5554");
        } else if (devices == device[2]) {
            desiredCapabilities.setCapability("appium:deviceName", "vivo 1807");
            desiredCapabilities.setCapability("appium:udid", "4c15c256");
        } else if (devices == device[3]) {
            desiredCapabilities.setCapability("appium:deviceName", "OPPI");
            desiredCapabilities.setCapability("appium:udid", "QSS4TKEAQWLFQOGA");
        }
    }
}
