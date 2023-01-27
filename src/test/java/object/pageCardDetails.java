package object;

import config.setUp;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class pageCardDetails extends setUp {

    By buttonEditCardName = By.xpath("//android.view.View[@content-desc=\""+cardName1+"\"]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[1]");
    public By getButtonEditCardName() {
        return buttonEditCardName;
    }

    By fieldInputCardName = By.xpath("//android.view.View[contains(@content-desc,\"Due dates\")]/android.widget.EditText");
    public By getFieldInputCardName() {
        return fieldInputCardName;
    }

    By buttonSaveEditCardName = By.xpath("//android.view.View[contains(@content-desc,\"Due dates\")]/android.widget.Button");
    public By getButtonSaveEditCardName() {
        return buttonSaveEditCardName;
    }

    By headerNewCardName = By.xpath("//android.view.View[@content-desc=\""+cardNameEdit+"\"]");
    public By getHeaderNewCardName() {
        return headerNewCardName;
    }

    By buttonAddLabel = By.xpath("//android.view.View[@content-desc=\""+cardNameEdit+"\"]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]");
    public By getButtonAddLabel() {
        return buttonAddLabel;
    }

    By fieldInputLabelName = By.xpath("//*/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
    public By getFieldInputLabelName() {
        return fieldInputLabelName;
    }

    By colorLabel = By.xpath("//*/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]");
    public By getColorLabel() {
        return colorLabel;
    }

    By buttonSubmitCreateLabel = By.xpath("//android.widget.Button[@content-desc=\"submit\"]");
    public By getButtonSubmitCreateLabel() {
        return buttonSubmitCreateLabel;
    }

    By headerCreatedLabel = By.xpath("//android.view.View[@content-desc=\""+labelName+"\"]");
    public By getHeaderCreatedLabel() {
        return headerCreatedLabel;
    }

    By notifLabelApplied = By.xpath("//android.view.View[@content-desc=\"toggle label card is success\"]");
    public By getNotifLabelApplied() {
        return notifLabelApplied;
    }

    By buttonRemoveLabel = By.xpath("//android.view.View[@content-desc=\""+cardNameEdit+"\"]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[3]");
    public By getButtonRemoveLabel() {
        return buttonRemoveLabel;
    }

    By txtLabelApplied = By.xpath("//*/android.view.View[contains(@text, \""+labelName+"\")]");
    public By getTxtLabelApplied() {
        return txtLabelApplied;
    }

    By buttonDeleteLabel = By.xpath("//android.view.View[@content-desc=\""+labelName+"\"]/android.view.View");
    public By getButtonDeleteLabel() {
        return buttonDeleteLabel;
    }

    By buttonDeleteConfirmation = By.xpath("//android.widget.Button[@content-desc=\"Delete\"]");
    public By getButtonDeleteConfirmation() {
        return buttonDeleteConfirmation;
    }

    By buttonAddCardDescription = By.xpath("//android.view.View[@content-desc=\""+cardNameEdit+"\"]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[3]");
    public By getButtonAddCardDescription() {
        return buttonAddCardDescription;
    }

    By buttonPublishDescription = By.xpath("//android.widget.Button[@content-desc=\"Publish\"]");
    public By getButtonPublishDescription() {
        return buttonPublishDescription;
    }

    By notifNotesUpdated = By.xpath("//android.view.View[@content-desc=\"update notes success\"]");
    public By getNotifNotesUpdated() {
        return notifNotesUpdated;
    }

    By buttonAddComments = By.xpath("//android.view.View[@content-desc=\"Add new comment...\"]");
    public By getButtonAddComments() {
        return buttonAddComments;
    }

    By buttonSubmitComment = By.xpath("//android.widget.Button[@content-desc=\"submit\"]");
    public By getButtonSubmitComment() {
        return buttonSubmitComment;
    }

    By buttonCheersComments = By.xpath("//*/android.view.View[contains(@content-desc,\""+userName+"\")]/android.widget.ImageView[2]");
    public By getButtonCheersComments() {
        return buttonCheersComments;
    }

    By scrollToComments = MobileBy.AndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true)).scrollIntoView(descriptionContains(\""+userName+"\"))");
    public By getScrollToComments() {
        return scrollToComments;
    }

    By inputCheersText = By.xpath("//*/android.view.View[contains(@content-desc,\""+userName+"\")]/android.widget.EditText");
    public By getInputCheersText() {
        return inputCheersText;
    }

    By buttonSaveCheers = By.xpath("//*/android.view.View[contains(@content-desc,\""+userName+"\")]/android.view.View[2]");
    public By getButtonSaveCheers() {
        return buttonSaveCheers;
    }

    By buttonCheers = By.xpath("//android.widget.ImageView[@content-desc=\""+textCheers+"\"]");
    public By getButtonCheers() {
        return buttonCheers;
    }

    By buttonDeleteCheers = By.xpath("//*/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]");
    public By getButtonDeleteCheers() {
        return buttonDeleteCheers;
    }

    By buttonMenuComments = By.xpath("//*/android.view.View[contains(@content-desc,\""+userName+"\")]/android.view.View[1]");
    public By getButtonMenuComments() {
        return buttonMenuComments;
    }

    By buttonArchiveComment = By.xpath("//android.view.View[@content-desc=\"Archive\"]");
    public By getButtonArchiveComment() {
        return buttonArchiveComment;
    }

    By notifCommentArchived = By.xpath("//android.view.View[@content-desc=\"your comment has been archived\"]");
    public By getNotifCommentArchived() {
        return notifCommentArchived;
    }
}
