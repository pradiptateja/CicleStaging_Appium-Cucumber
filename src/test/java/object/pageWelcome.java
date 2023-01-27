package object;

import org.openqa.selenium.By;

public class pageWelcome {

    By buttonSkip = By.xpath("//android.view.View[@content-desc=\"Skip\"]");
    public By getButtonSkip() {
        return buttonSkip;
    }

    By imgLogo = By.xpath("//android.widget.ImageView[@content-desc=\"logo\"]");
    public By getImgLogo() {
        return imgLogo;
    }

    By buttonYes = By.xpath("//android.widget.Button[@content-desc=\"Yes!\"]");
    public By getButtonYes() {
        return buttonYes;
    }

    By buttonToLoginPage = By.xpath("//android.widget.Button[@content-desc=\"Go to Sign In\"]");
    public By getButtonToLoginPage() {
        return buttonToLoginPage;
    }
}
