package helper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;

public class gesture {

    public void swipe(AppiumDriver driver, double start_X, double start_Y, double end_X, double end_Y ) {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * start_X);
        int startY = (int) (size.height * start_Y);
        int endX = (int) (size.width * end_X);
        int endY = (int) (size.height * end_Y);

        TouchAction swipe = new TouchAction((PerformsTouchActions) driver);

        swipe.press(PointOption.point(startX,startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(point(endX,endY))
                .release()
                .perform();

    }

    public void dragAndDrop(AppiumDriver driver, WebElement from, WebElement to) {
        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        action.longPress(new LongPressOptions().withElement(new ElementOption().withElement(from)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(element(to))
                .release()
                .perform();
    }
}
