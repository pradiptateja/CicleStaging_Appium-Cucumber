package stepDefinition;

import config.setUp;
import helper.*;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.pageCardDetails;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class cardDetails extends setUp {

    pageCardDetails pageCardDetails = new pageCardDetails();
    touch touch = new touch();

    @When("user clicks edit card name button")
    public void user_clicks_edit_card_name_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonEditName = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getButtonEditCardName()));
        buttonEditName.isDisplayed();
        buttonEditName.click();
    }

    @When("user input new card name")
    public void user_input_new_card_name() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement inputCardName = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getFieldInputCardName()));
        inputCardName.isDisplayed();
        inputCardName.click();
        inputCardName.sendKeys(cardNameEdit);
    }

    @When("user clicks save button to rename the card")
    public void user_clicks_save_button_to_rename_the_card() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonSave = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getButtonSaveEditCardName()));
        buttonSave.isDisplayed();
        buttonSave.click();

    }

    @Then("user can see the new name appearing")
    public void user_can_see_the_new_name_appearing() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement headerCardName = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getHeaderNewCardName()));
        headerCardName.isDisplayed();
    }

    @When("user clicks add label")
    public void user_clicks_add_label() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        Thread.sleep(threadSleep);

        WebElement buttonAddLabel = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getButtonAddLabel()));
        buttonAddLabel.isDisplayed();
        buttonAddLabel.click();
    }

    @When("user input label name")
    public void user_input_label_name() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement inputLabelName = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getFieldInputLabelName()));
        inputLabelName.isDisplayed();
        inputLabelName.click();
        inputLabelName.sendKeys(labelName);

        driver.navigate().back();
    }

    @When("user pick one color for the label")
    public void user_pick_one_color_for_the_label() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement colorLabel = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getColorLabel()));
        colorLabel.isDisplayed();
        colorLabel.click();
    }

    @When("user clicks submit button for the label")
    public void user_clicks_submit_button_for_the_label() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonSubmit = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getButtonSubmitCreateLabel()));
        buttonSubmit.isDisplayed();
        buttonSubmit.click();

    }

    @Then("user can see the created label")
    public void user_can_see_the_created_label() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement headerCreatedLabel = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getHeaderCreatedLabel()));
        headerCreatedLabel.isDisplayed();
    }

    @When("user chooses existing label")
    public void user_chooses_existing_label() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement headerCreatedLabel = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getHeaderCreatedLabel()));
        headerCreatedLabel.isDisplayed();
        headerCreatedLabel.click();

    }

    @Then("user is notified label has applied")
    public void user_is_notified_label_has_applied() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement notifLabelApplied = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getNotifLabelApplied()));
        notifLabelApplied.isDisplayed();
    }

    @When("user clicks remove label from card")
    public void user_clicks_remove_label_from_card() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonRemoveLabel = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getButtonRemoveLabel()));
        buttonRemoveLabel.isDisplayed();
        buttonRemoveLabel.click();

    }

    @Then("user cannot see the removed label on card")
    public void user_cannot_see_the_removed_label_on_card() {
        List<WebElement> labelAppliedPresence = driver.findElements(pageCardDetails.getTxtLabelApplied());
        Assert.assertEquals(labelAppliedPresence.size(), 0);
    }

    @When("user clicks delete button on existing label")
    public void user_clicks_delete_button_on_existing_label() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonDelete = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getButtonDeleteLabel()));
        buttonDelete.isDisplayed();
        buttonDelete.click();
    }

    @When("user clicks delete to confirm delete label")
    public void user_clicks_delete_to_confirm_delete_label() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        WebElement buttonConfirmDelete = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getButtonDeleteConfirmation()));
        buttonConfirmDelete.isDisplayed();
        buttonConfirmDelete.click();
    }

    @Then("user cannot see the deleted label")
    public void user_cannot_see_the_deleted_label() {
        List<WebElement> headerCreatedLabel = driver.findElements(pageCardDetails.getHeaderCreatedLabel());
        Assert.assertTrue(headerCreatedLabel.size() == 0);
    }

    @When("user click edit card description button")
    public void user_click_edit_card_description_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonAddDesc = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getButtonAddCardDescription()));
        buttonAddDesc.isDisplayed();
        buttonAddDesc.click();
    }

    @When("user touch field")
    public void user_touch_field() throws InterruptedException {
        Thread.sleep(threadSleep);
        touch.oneTap(driver,0.5,0.5);
    }

    @When("user touch keyboard for any typing")
    public void user_touch_keyboard_for_any_typing() throws InterruptedException {
        Thread.sleep(threadSleep);
        touch.oneTap(driver,0.5, 0.79);
        touch.oneTap(driver,0.52,0.80);
        touch.oneTap(driver,0.4,0.80);
        touch.oneTap(driver,0.6, 0.82);
    }

    @When("user clicks publish button")
    public void user_clicks_publish_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonPublish = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getButtonPublishDescription()));
        buttonPublish.isDisplayed();
        buttonPublish.click();
    }

    @Then("user is notified success update notes")
    public void user_is_notified_success_update_notes() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement notifSuccessAddNotes = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getNotifNotesUpdated()));
        notifSuccessAddNotes.isDisplayed();
    }

    @When("user click add comments button")
    public void user_click_add_comments_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonAddComment = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getButtonAddComments()));
        buttonAddComment.isDisplayed();
        buttonAddComment.click();
    }

    @When("user touch the input comment field")
    public void user_touch_the_input_comment_field() {
        touch.oneTap(driver,0.5, 0.7918);
    }

    @When("user clicks submit for adding comments")
    public void user_clicks_submit_for_adding_comments() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonSubmitComment = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getButtonSubmitComment()));
        buttonSubmitComment.isDisplayed();
        buttonSubmitComment.click();
    }

    @Then("user scroll down until can see the comment")
    public void user_scroll_down_until_can_see_the_new_comment() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement scrollToComment = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getScrollToComments()));
        scrollToComment.click();
    }

    @When("user clicks on cheers button")
    public void user_clicks_on_cheers_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonCheers = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getButtonCheersComments()));
        buttonCheers.isDisplayed();
        buttonCheers.click();
    }

    @When("user input text for cheers")
    public void user_input_text_for_cheers() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement inputCheersText = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getInputCheersText()));
        inputCheersText.isDisplayed();
        inputCheersText.click();
        inputCheersText.sendKeys(textCheers);
    }

    @When("user clicks done to save the cheers")
    public void user_clicks_done_to_save_the_cheers() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonSave = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getButtonSaveCheers()));
        buttonSave.isDisplayed();
        buttonSave.click();
    }

    @Then("user can see the cheers given")
    public void user_can_see_the_cheers_given() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonAddedCheers = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getButtonCheers()));
        buttonAddedCheers.isDisplayed();
    }

    @When("user click the added cheers")
    public void user_click_the_added_cheers() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonAddedCheers = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getButtonCheers()));
        buttonAddedCheers.isDisplayed();
        buttonAddedCheers.click();
    }

    @When("user clicks delete button on cheers")
    public void user_clicks_delete_button_on_cheers() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonDeleteCheers = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getButtonDeleteCheers()));
        buttonDeleteCheers.isDisplayed();
        buttonDeleteCheers.click();
    }

    @Then("user cannot see the deleted cheers")
    public void user_cannot_see_the_deleted_cheers() throws InterruptedException {
        Thread.sleep(threadSleep);
        List<WebElement> existingCheers = driver.findElements(pageCardDetails.getButtonCheers());
        Assert.assertTrue(existingCheers.size() == 0);
    }

    @When("user clicks on comment menu")
    public void user_clicks_on_comment_menu() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonMenu = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getButtonMenuComments()));
        buttonMenu.isDisplayed();
        buttonMenu.click();
    }

    @When("user clicks archive comment")
    public void user_clicks_archive_comment() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonArchiveComment = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getButtonArchiveComment()));
        buttonArchiveComment.isDisplayed();
        buttonArchiveComment.click();
    }

    @Then("user is notified comment has been archived")
    public void user_is_notified_comment_has_been_archived() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement notifCommentArchived = wait.until(ExpectedConditions.presenceOfElementLocated(pageCardDetails.getNotifCommentArchived()));
        notifCommentArchived.isDisplayed();
    }
}
