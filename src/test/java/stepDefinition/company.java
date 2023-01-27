package stepDefinition;

import config.setUp;
import io.cucumber.java.en.And;
import object.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class company extends setUp {

    pageCompanyCreation elementPageCompanyCreation = new pageCompanyCreation();
    pageHome elementPageHome = new pageHome();

    pageCompany elementPageCompany = new pageCompany();

    @When("user clicks on create new company button")
    public void user_clicks_on_create_new_company_button() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonNewCompany = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageHome.getButtonCreateCompany()));
        buttonNewCompany.isDisplayed();
        buttonNewCompany.click();
    }

    @When("user fills company name")
    public void user_fills_company_name() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement fieldName = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageCompanyCreation.getFieldName()));
        fieldName.isDisplayed();
        fieldName.click();
        fieldName.sendKeys(companyName);
    }

    @When("user fills company description")
    public void user_fills_company_description() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement fieldDescription = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageCompanyCreation.getFiledDescription()));
        fieldDescription.isDisplayed();
        fieldDescription.click();
        fieldDescription.sendKeys(description);
    }

    @When("user clicks create button")
    public void user_clicks_create_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonCreate = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageCompanyCreation.getButtonCreate()));
        buttonCreate.isDisplayed();
        buttonCreate.click();
    }

    @Then("company successfully created")
    public void company_successfully_created() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement notifSuccess = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageCompany.getNotifCompanyCreationSuccess()));
        notifSuccess.isDisplayed();

        WebElement headerCreatedCompany = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageHome.getButtonCreatedCompanyName()));
        headerCreatedCompany.isDisplayed();

        WebElement buttonCompanyFeatures = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageCompany.getButtonCompanyFeatures()));
        buttonCompanyFeatures.isDisplayed();
    }

    @Then("user is notified field must filled")
    public void user_is_notified_field_must_filled() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement txtError = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageCompanyCreation.getTxtError()));
        txtError.isDisplayed();
    }

    @And("user clicks close button on company creation page")
    public void user_clicks_close_button_on_company_creation_page() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonClose = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageCompanyCreation.getButtonClose()));
        buttonClose.isDisplayed();
        buttonClose.click();
    }
}
