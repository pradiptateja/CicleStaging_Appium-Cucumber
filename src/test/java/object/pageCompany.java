package object;

import config.setUp;
import org.openqa.selenium.By;

public class pageCompany extends setUp {

    By buttonCompanyFeatures = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    public By getButtonCompanyFeatures() {
        return buttonCompanyFeatures;
    }

    By NotifCompanyCreationSuccess = By.xpath("//android.view.View[@content-desc=\"Successfully create company user\"]");
    public By getNotifCompanyCreationSuccess() {
        return NotifCompanyCreationSuccess;
    }

    By buttonCreatedTeam = By.xpath("//android.widget.Button[@content-desc="+ "\""+ teamName + "\n" +
            description+"\"]");
    public By getButtonCreatedTeam() {
        return buttonCreatedTeam;
    }

}
