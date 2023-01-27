package stepDefinition;

import config.setUp;
import object.*;
import helper.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class board extends setUp {

    pageCompany elementPageCompany = new pageCompany();
    pageTeam elementPageTeam = new pageTeam();
    pageBoard elementPageBoard = new pageBoard();

    gesture gesture = new gesture();
    touch touch = new touch();

    @When("user clicks the existing team")
    public void user_clicks_the_existing_team() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonCreatedTeam = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageCompany.getButtonCreatedTeam()));
        buttonCreatedTeam.isDisplayed();
        buttonCreatedTeam.click();
    }

    @When("user clicks settings button")
    public void user_clicks_settings_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonSettingTeam = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageTeam.getButtonSettingTeam()));
        buttonSettingTeam.isDisplayed();
        buttonSettingTeam.click();
    }

    @When("user clicks edit menu button")
    public void user_clicks_edit_menu_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonEditMenuTeam = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageTeam.getButtonEditMenuTeam()));
        buttonEditMenuTeam.isDisplayed();
        buttonEditMenuTeam.click();

    }

    @When("user switch off board button")
    public void user_switch_off_board_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonSwitchBoard = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageTeam.getSwitchBoardFeature()));
        buttonSwitchBoard.isDisplayed();
        buttonSwitchBoard.click();

    }

    @When("user clicks save button")
    public void user_clicks_save_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonSave = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageTeam.getButtonSaveMenuEdit()));
        buttonSave.isDisplayed();
        buttonSave.click();
    }

    @When("user swipe the screen right")
    public void user_swipe_the_screen_right() {
        gesture.swipe(driver,0.05,0.5,0.9,0.5);
    }

    @Then("user cannot see board feature")
    public void user_cannot_see_board_feature() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        List<WebElement> buttonBoard = driver.findElements(elementPageTeam.getButtonBoardTeam());
        boolean isInvisible = buttonBoard.size() == 0;

        Assert.assertTrue(isInvisible);

    }

    @When("user switch on board button")
    public void user_switch_on_board_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonSwitchBoard = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageTeam.getSwitchBoardFeature()));
        buttonSwitchBoard.isDisplayed();
        buttonSwitchBoard.click();
    }

    @Then("user can see board feature")
    public void user_can_see_board_feature() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonBoardTeam = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageTeam.getButtonBoardTeam()));
        buttonBoardTeam.isDisplayed();
    }

    @When("user clicks team board feature")
    public void user_clicks_team_board_feature() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonBoard = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageTeam.getButtonBoardTeam()));
        buttonBoard.isDisplayed();
        buttonBoard.click();
    }

    @When("user clicks add List button")
    public void user_clicks_add_list_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonAddList = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonAddList()));
        buttonAddList.isDisplayed();
        buttonAddList.click();

    }

    @When("user input List name")
    public void user_input_list_name() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement inputListName = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getInputListName()));
        inputListName.isDisplayed();
        inputListName.click();
        inputListName.sendKeys(listName1);
    }

    @When("user clicks submit button")
    public void user_clicks_submit_button() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonSubmit = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonSubmit()));
        buttonSubmit.isDisplayed();
        buttonSubmit.click();
    }

    @Then("user can see the created List")
    public void user_can_see_the_created_list() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement headerListName = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getHeaderListName1()));
        headerListName.isDisplayed();
    }

    @Then("user cannot see the created List")
    public void user_cannot_see_the_created_list() {
        List<WebElement> headerListName = driver.findElements(elementPageBoard.getHeaderListName1());
        Assert.assertTrue(headerListName.size() == 0);
    }

    @When("user input another List name")
    public void user_input_another_list_name() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement inputListName = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getInputListName()));
        inputListName.isDisplayed();
        inputListName.click();
        inputListName.sendKeys(listName2);
    }

    @Then("user can see the two created Lists")
    public void user_can_see_the_two_created_lists() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement headerListName1 = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getHeaderListName1()));
        WebElement headerListName2 = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getHeaderListName2()));
        headerListName1.isDisplayed();
        headerListName2.isDisplayed();
    }

    @When("user clicks List option button")
    public void user_clicks_list_option_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonOption = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonListOption()));
        buttonOption.isDisplayed();
        buttonOption.click();
    }

    @When("user clicks Archive button")
    public void user_clicks_archive_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonArchive = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonArchiveList()));
        buttonArchive.isDisplayed();
        buttonArchive.click();
    }

    @Then("user cannot see the archived List")
    public void user_cannot_see_the_archived_list() {
        List<WebElement> headerListName = driver.findElements(elementPageBoard.getHeaderListName1());
        Assert.assertTrue(headerListName.size() == 0);
    }

    @When("user clicks archive menu")
    public void user_clicks_archive_menu() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonAchieveMenu = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonAchieveMenu()));
        buttonAchieveMenu.isDisplayed();
        buttonAchieveMenu.click();
    }

    @When("user clicks list archive option")
    public void user_clicks_list_archive_option() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonArchiveListOption = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonArchiveListOption()));
        buttonArchiveListOption.isDisplayed();
        buttonArchiveListOption.click();
    }

    @When("user clicks restore button")
    public void user_clicks_restore_button() throws InterruptedException {
        Thread.sleep(threadSleep);
        touch.oneTap(driver,0.843,0.345);

        Dimension size = driver.manage().window().getSize();
        System.out.println(size);
    }

    @When("user clicks OK button")
    public void user_clicks_ok_button() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonOKRestore = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonOKRestore()));
        buttonOKRestore.isDisplayed();
        buttonOKRestore.click();

        Thread.sleep(threadSleep);
    }

    @Then("user can see the archived list on Board")
    public void user_can_see_the_archived_list_on_board() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement headerListName = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getHeaderListName1()));
        headerListName.isDisplayed();
    }

    @When("user clicks Complete button")
    public void user_clicks_complete_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonCompleteMark = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getButtonCompleteMark()));
        buttonCompleteMark.isDisplayed();
        buttonCompleteMark.click();
    }

    @Then("user can see green symbol in List name")
    public void user_can_see_green_symbol_in_list_name() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement symbolCompleteMark = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getSymbolCompleteMark()));
        symbolCompleteMark.isDisplayed();
        symbolCompleteMark.click();

    }

    @When("user gets the current list order")
    public void user_gets_the_current_list_order() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement headerInPlaceA = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getTxtListName(1)));
        initialListInPlaceA = headerInPlaceA.getAttribute("content-desc");

        WebElement headerInPlaceB = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getTxtListName(2)));
        initialListInPlaceB = headerInPlaceB.getAttribute("content-desc");
    }

    @When("user change the list order by hold-drag-drop")
    public void user_change_the_list_order_by_hold_drag_drop() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        WebElement List1 = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getTxtListName(1)));
        WebElement List2 = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getTxtListName(2)));

        gesture.dragAndDrop(driver,List1,List2);
    }

    @Then("user can see the changed list order")
    public void user_can_see_the_changed_list_order() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement headerInPlaceA = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getTxtListName(1)));
        String AfterReorderA = headerInPlaceA.getAttribute("content-desc");
        WebElement headerInPlaceB = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageBoard.getTxtListName(2)));
        String AfterReorderB = headerInPlaceB.getAttribute("content-desc");

        Assert.assertNotEquals(initialListInPlaceA,AfterReorderA);
        Assert.assertNotEquals(initialListInPlaceB,AfterReorderB);
    }


}
