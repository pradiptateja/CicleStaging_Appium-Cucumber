package stepDefinition;

import config.setUp;
import helper.gesture;
import io.cucumber.java.en.And;
import object.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class card extends setUp {

    pageBoard elementPageBoard = new pageBoard();
    gesture gesture = new gesture();


    @When("user clicks Add new card")
    public void user_clicks_add_new_card() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonAddNewCard = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonAddNewCard()));
        buttonAddNewCard.isDisplayed();
        buttonAddNewCard.click();
    }

    @When("user input card name")
    public void user_input_card_name() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement inputCardName = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getInputCardName()));
        inputCardName.isDisplayed();
        inputCardName.click();
        inputCardName.sendKeys(cardName1);
    }

    @When("user clicks checklist button")
    public void user_clicks_checklist_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonChecklist = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonChecklist()));
        buttonChecklist.isDisplayed();
        buttonChecklist.click();
    }

    @Then("user can see the created card")
    public void user_can_see_the_created_card() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement headerCard = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonHeaderCard1()));
        headerCard.isDisplayed();
    }

    @Then("user cannot see the created card")
    public void user_cannot_see_the_created_card() {

        List<WebElement> headerCard = driver.findElements(elementPageBoard.getButtonHeaderCard1());
        Assert.assertEquals(headerCard.size(), 0);

    }

    @When("user input private card name")
    public void user_input_private_card_name() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement inputCardName = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getInputCardName()));
        inputCardName.isDisplayed();
        inputCardName.click();
        inputCardName.sendKeys(cardName2);
    }

    @When("user switch on the private option")
    public void user_switch_on_the_private_option() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement switcherPrivate = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getSwitcherPrivateCard()));
        switcherPrivate.isDisplayed();
        switcherPrivate.click();
    }

    @When("user clicks private card")
    public void user_clicks_private_card() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonHeaderCard2 = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonHeaderCard2()));
        buttonHeaderCard2.isDisplayed();
        buttonHeaderCard2.click();
    }

    @When("user clicks one card")
    public void user_clicks_one_card() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonHeaderCard1 = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonHeaderCard1()));
        buttonHeaderCard1.isDisplayed();
        buttonHeaderCard1.click();
    }

    @When("user clicks Set card to private")
    public void user_clicks_set_card_to_private() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonSetCardToPrivate = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonSetCardToPrivate()));
        buttonSetCardToPrivate.isDisplayed();
        buttonSetCardToPrivate.click();

    }


    @When("user clicks Set card to public")
    public void user_clicks_set_card_to_public() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonSetCardToPublic = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonSetCardToPublic()));
        buttonSetCardToPublic.isDisplayed();
        buttonSetCardToPublic.click();
    }

    @Then("user see notification card status updated")
    public void user_see_notification_card_status_updated(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement notifCardStatus = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getNotifCardUpdate()));
        notifCardStatus.isDisplayed();
    }

    @When("user clicks Archive Card")
    public void user_clicks_archive_card() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonArchiveCard = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonArchiveCard()));
        buttonArchiveCard.isDisplayed();
        buttonArchiveCard.click();

    }

    @And("user clicks Archive button confirmation")
    public void user_clicks_archive_button_confirmation() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        WebElement buttonArchiveConfirm = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonConfirmArchive()));
        buttonArchiveConfirm.isDisplayed();
        buttonArchiveConfirm.click();
    }


    @Then("user can see archive success notification")
    public void user_can_see_archive_success_notification(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        WebElement notifSuccess = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getNotifArchiveSuccess()));
        notifSuccess.isDisplayed();

    }

    @When("user get all card on list")
    public void user_get_all_card_on_list() {
        List<WebElement> cardOnList = driver.findElements(elementPageBoard.getListCardExists());
        initialCardAmount = cardOnList.size();

    }

    @When("user clicks card option on card")
    public void user_clicks_card_option_on_card() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonCardOption = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonCardOption()));
        buttonCardOption.isDisplayed();
        buttonCardOption.click();
    }

    @When("user clicks move card")
    public void user_clicks_move_card() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        WebElement buttonMoveCard = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonMoveCard()));
        buttonMoveCard.isDisplayed();
        buttonMoveCard.click();
    }

    @When("user clicks List choices")
    public void user_clicks_list_choices() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonOption = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getHeaderListName2()));
        buttonOption.isDisplayed();
        buttonOption.click();
    }

    @When("user clicks other List")
    public void user_clicks_other_list() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        WebElement buttonSelectedList = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonSelectedList()));
        buttonSelectedList.isDisplayed();
        buttonSelectedList.click();
    }

    @When("user clicks done button on Move Card page")
    public void user_clicks_done_button_on_move_card_page() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        WebElement buttonDoneMove = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonDoneMoveList()));
        buttonDoneMove.isDisplayed();
        buttonDoneMove.click();
    }

    @Then("user can see different amount of card on List")
    public void user_can_see_different_amount_of_card_on_list() {
        List<WebElement> cardOnList = driver.findElements(elementPageBoard.getListCardExists());
        int currentCardAmount = cardOnList.size();

        Assert.assertNotEquals(currentCardAmount, initialCardAmount);
    }

    @When("user hold-drag-drop card to another list")
    public void user_hold_drag_drop_card_to_another_list() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement headerCard1 = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonHeaderCard1()));
        WebElement headerList2 = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getHeaderListName2()));

        gesture.dragAndDrop(driver,headerCard1,headerList2);
    }

    @When("user clicks copy card")
    public void user_clicks_copy_card() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonCopyCard = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonCopyCard()));
        buttonCopyCard.isDisplayed();
        buttonCopyCard.click();
    }

    @Then("user can see under development notification")
    public void user_can_see_under_development_notification() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        WebElement notifUnderDevelopment = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getNotifUnderDevelopment()));
        notifUnderDevelopment.isDisplayed();
    }
}
