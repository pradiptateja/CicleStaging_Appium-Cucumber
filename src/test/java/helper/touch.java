package helper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

public class touch {

    public void oneTap(AppiumDriver driver, double pointX, double pointY ) {
        Dimension size = driver.manage().window().getSize();
        int point_X = (int) (size.width * pointX);
        int point_Y = (int) (size.height * pointY);

        TouchAction action = new TouchAction((PerformsTouchActions) driver);

        action.tap(PointOption.point(point_X, point_Y)).perform();
    }
}
