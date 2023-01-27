package stepDefinition;

import config.setUp;
import io.cucumber.java.en.And;
import object.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class team extends setUp {

    pageHome elementPageHome = new pageHome();
    pageCompany elementPageCompany = new pageCompany();

    pageTeamCreation elementPageTeamCreation = new pageTeamCreation();

    @Given("user clicks the existing company")
    public void user_clicks_the_existing_company() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonExistingCompany = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageHome.getButtonCreatedCompanyName()));
        buttonExistingCompany.isDisplayed();
        buttonExistingCompany.click();

        Thread.sleep(threadSleep);
    }

    @When("user clicks company add features button")
    public void user_clicks_company_add_features_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonCompanyFeatures = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageCompany.getButtonCompanyFeatures()));
        buttonCompanyFeatures.isDisplayed();
        buttonCompanyFeatures.click();
    }

    @When("user clicks Add new team button")
    public void user_clicks_add_new_team_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        WebElement buttonAddTeam = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageTeamCreation.getButtonAddTeam()));
        buttonAddTeam.isDisplayed();
        buttonAddTeam.click();
    }

    @When("user inputs team name")
    public void user_inputs_team_name() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement inputName = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageTeamCreation.getInputName()));
        inputName.click();
        inputName.sendKeys(teamName);
    }

    @When("user inputs team description")
    public void user_inputs_team_description() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement inputDescription = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageTeamCreation.getInputDescription()));
        inputDescription.click();
        inputDescription.sendKeys(description);
    }

    @Then("user is directed to company page")
    public void user_is_directed_to_company_page() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement headerCreatedCompany = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageHome.getButtonCreatedCompanyName()));
        headerCreatedCompany.isDisplayed();

        WebElement buttonCompanyFeatures = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageCompany.getButtonCompanyFeatures()));
        buttonCompanyFeatures.isDisplayed();
    }

    @When("user clicks close button on team creation page")
    public void user_clicks_close_button_on_team_creation_page() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonClose = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageTeamCreation.getButtonClose()));
        buttonClose.isDisplayed();
        buttonClose.click();

    }

    @When("user clicks phone back button")
    public void user_clicks_phone_back_button() {
        driver.navigate().back();
    }
    @Then("team is successfully created")
    public void team_is_successfully_created() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonCreatedTeam = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageCompany.getButtonCreatedTeam()));
        buttonCreatedTeam.isDisplayed();
    }

}
