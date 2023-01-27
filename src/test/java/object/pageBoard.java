package object;

import config.setUp;
import org.openqa.selenium.By;

public class pageBoard extends setUp {

    By buttonAddList = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    public By getButtonAddList() {
        return buttonAddList;
    }

    By inputListName = By.xpath("//android.widget.EditText[@text=\"Add new list...\"]");
    public By getInputListName() {
        return inputListName;
    }

    By buttonSubmit = By.xpath("//android.widget.Button[@content-desc=\"Submit\"]");
    public By getButtonSubmit() {
        return buttonSubmit;
    }

    By headerListName1 = By.xpath("//android.view.View[@content-desc=\"" +listName1+ "\"]");
    public By getHeaderListName1() {
        return headerListName1;
    }

    By headerListName2 = By.xpath("//android.view.View[@content-desc=\"" +listName2+ "\"]");
    public By getHeaderListName2() {
        return headerListName2;
    }

    By buttonListOption = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]");
    public By getButtonListOption() {
        return buttonListOption;
    }

    By buttonArchiveList = By.xpath("//android.view.View[@content-desc=\"Archive this list\"]");
    public By getButtonArchiveList() {
        return buttonArchiveList;
    }

    By buttonAchieveMenu = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]");
    public By getButtonAchieveMenu() {
        return buttonAchieveMenu;
    }

    By buttonArchiveListOption = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]");
    public By getButtonArchiveListOption() {
        return buttonArchiveListOption;
    }

    By buttonOKRestore = By.xpath("//android.widget.Button[@content-desc=\"Ok\"]");
    public By getButtonOKRestore() {
        return buttonOKRestore;
    }

    By buttonCompleteMark = By.xpath("//android.view.View[@content-desc=\"Set as a Complete List\"]");
    public By getButtonCompleteMark() {
        return buttonCompleteMark;
    }

    By symbolCompleteMark = By.xpath("//android.widget.Button[@content-desc=\"Show menu\"]");
    public By getSymbolCompleteMark() {
        return symbolCompleteMark;
    }

    public  By getTxtListName(int ListOrder) {
        By txt_listNameOrder = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View["+ListOrder+"]/android.view.View[1]");
        return txt_listNameOrder;
    }

    By buttonAddNewCard = By.xpath("//android.widget.Button[@content-desc=\"Add new card\"]");
    public By getButtonAddNewCard() {
        return buttonAddNewCard;
    }

    By inputCardName = By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText");
    public By getInputCardName() {
        return inputCardName;
    }

    By buttonChecklist = By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText/android.view.View");
    public By getButtonChecklist() {
        return buttonChecklist;
    }

    By buttonHeaderCard1 = By.xpath("//android.widget.Button[contains(@content-desc,\""+cardName1+"\")]");
    public By getButtonHeaderCard1() {
        return buttonHeaderCard1;
    }

    By buttonHeaderCard2 = By.xpath("//android.widget.Button[contains(@content-desc,\""+cardName2+"\")]");
    public By getButtonHeaderCard2() {
        return buttonHeaderCard2;
    }

    By switcherPrivateCard = By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.Switch");
    public By getSwitcherPrivateCard() {
        return switcherPrivateCard;
    }

    By buttonSetCardToPrivate = By.xpath("//android.widget.Button[@content-desc=\"Set card to private\"]");
    public By getButtonSetCardToPrivate() {
        return buttonSetCardToPrivate;
    }

    By buttonSetCardToPublic = By.xpath("//android.widget.Button[@content-desc=\"Set card to public\"]");
    public By getButtonSetCardToPublic() {
        return buttonSetCardToPublic;
    }

    By notifCardUpdate = By.xpath("//android.view.View[@content-desc=\"Update card is success\"]");
    public By getNotifCardUpdate() {
        return notifCardUpdate;
    }

    By buttonArchiveCard = By.xpath("//android.widget.Button[@content-desc=\"Archive card\"]");
    public By getButtonArchiveCard() {
        return buttonArchiveCard;
    }

    By buttonConfirmArchive = By.xpath("//android.widget.Button[@content-desc=\"Archive\"]");
    public By getButtonConfirmArchive() {
        return buttonConfirmArchive;
    }

    By notifArchiveSuccess = By.xpath("//android.view.View[contains(@content-desc,\"card has been moved to archived\")]");
    public By getNotifArchiveSuccess() {
        return notifArchiveSuccess;
    }

    By buttonCardOption = By.xpath("//android.widget.Button[@content-desc=\"Show menu\"]");
    public By getButtonCardOption() {
        return buttonCardOption;
    }

    By buttonMoveCard = By.xpath("//android.widget.Button[@content-desc=\"Move card\"]");
    public By getButtonMoveCard() {
        return buttonMoveCard;
    }

    By ListCardExists = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View/android.widget.Button");
    public By getListCardExists() {
        return ListCardExists;
    }

    By buttonSelectedList = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]");
    public By getButtonSelectedList() {
        return buttonSelectedList;
    }

    By buttonDoneMoveList = By.xpath("//*//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.Button");
    public By getButtonDoneMoveList() {
        return buttonDoneMoveList;
    }

    By buttonCopyCard = By.xpath("//android.widget.Button[@content-desc=\"Copy card\"]");
    public By getButtonCopyCard() {
        return buttonCopyCard;
    }

    By notifUnderDevelopment = By.xpath("//android.view.View[@content-desc=\"feature is under development\"]");
    public By getNotifUnderDevelopment() {
        return notifUnderDevelopment;
    }
}
