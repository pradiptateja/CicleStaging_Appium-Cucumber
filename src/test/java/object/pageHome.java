package object;

import config.setUp;
import org.openqa.selenium.By;

public class pageHome extends setUp {

    By notifNewUser = By.xpath("//android.view.View[@content-desc=\"you are a new user on this device and you have not joined any company, please create a new company or join another company\"]");
    public By getNotifNewUser() {
        return notifNewUser;
    }

    By buttonNotifClose = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
    public By getButtonNotifClose() {
        return buttonNotifClose;
    }

    By imgLogoCicle = By.xpath("//android.widget.ImageView[@content-desc=\"Cicle Logo\"]");
    public By getImgLogoCicle() {
        return imgLogoCicle;
    }

    By buttonCreateCompany = By.xpath("//android.widget.Button[@content-desc=\"Create New Company\"]");
    public By getButtonCreateCompany() {
        return buttonCreateCompany;
    }

    By buttonHome = By.xpath("//android.view.View[@content-desc=\"Home\n" +
            "Tab 1 of 4\"]");
    public By getButtonHome() {
        return buttonHome;
    }

    By buttonNotification = By.xpath("//android.view.View[@content-desc=\"Notification\n" +
            "Tab 2 of 4\"]");
    public By getButtonNotification() {
        return buttonNotification;
    }

    By buttonSearch = By.xpath("//android.view.View[@content-desc=\"Search\n" +
            "Tab 3 of 4\"]");
    public By getButtonSearch() {
        return buttonSearch;
    }

    By buttonMenu = By.xpath("//android.view.View[@content-desc=\"Menu\n" +
            "Tab 4 of 4\"]");
    public By getButtonMenu() {
        return buttonMenu;
    }

    By buttonCreatedCompanyName = By.xpath("//android.view.View[@content-desc="+ "\""+ companyName +"\"]");
    public By getButtonCreatedCompanyName() {
        return buttonCreatedCompanyName;
    }


}
