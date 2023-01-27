package object;

import org.openqa.selenium.By;

public class pageTeam {

    By buttonSettingTeam = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[3]");
    public By getButtonSettingTeam() {
        return buttonSettingTeam;
    }

    By buttonEditMenuTeam = By.xpath("//android.view.View[@content-desc=\"Edit Menu\"]");
    public By getButtonEditMenuTeam() {
        return buttonEditMenuTeam;
    }

    By switchBoardFeature = By.xpath("//android.view.View[@content-desc=\"Group Chat\n" +
            "Blast\n" +
            "Schedule\n" +
            "Board\n" +
            "Check-in\n" +
            "Docs & Files\"]/android.widget.Switch[4]");
    public By getSwitchBoardFeature() {
        return switchBoardFeature;
    }

    By buttonSaveMenuEdit = By.xpath("//android.widget.Button[@content-desc=\"Save\"]");
    public By getButtonSaveMenuEdit() {
        return buttonSaveMenuEdit;
    }

    By buttonBoardTeam = By.xpath("//*[@content-desc=\"Board\"]");
    public By getButtonBoardTeam() {
        return buttonBoardTeam;
    }


}
