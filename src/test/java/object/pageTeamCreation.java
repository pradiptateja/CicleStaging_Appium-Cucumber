package object;

import org.openqa.selenium.By;

public class pageTeamCreation {

    By buttonAddTeam = By.xpath("//android.view.View[@content-desc=\"Add new team\"]");
    public By getButtonAddTeam() {
        return buttonAddTeam;
    }

    By inputName = By.xpath("//android.widget.EditText[@text=\"type name...\"]");
    public By getInputName() {
        return inputName;
    }

    By inputDescription = By.xpath("//android.widget.EditText[@text=\"type description...\"]");
    public By getInputDescription() {
        return inputDescription;
    }

    By buttonClose = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[1]");
    public By getButtonClose() {
        return buttonClose;
    }
}
