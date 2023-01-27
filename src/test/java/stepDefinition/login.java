package stepDefinition;

import config.setUp;
import object.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class login extends setUp {

    pageWelcome elementPageWelcome = new pageWelcome();
    pageLogin elementPageLogin = new pageLogin();

    pageHome elementPageHome = new pageHome();

    @When("user clicks Go to sign in button")
    public void user_clicks_go_to_sign_in_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        WebElement buttonToLoginPage = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageWelcome.getButtonToLoginPage()));
        buttonToLoginPage.click();
    }

    @When("user clicks login with Google Account")
    public void user_clicks_login_with_google_account() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonSignInGoogle = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getButtonSignInGoogle()));
        buttonSignInGoogle.click();
    }

    @When("user clicks the selected Google Account")
    public void user_clicks_the_selected_google_account() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement accountGoogle = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getAccountGoogle()));
        accountGoogle.click();
    }

    @Then("user is directed to application homepage")
    public void user_is_directed_to_application_homepage() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement imgLogoCicle = wait.until(ExpectedConditions
                .presenceOfElementLocated(elementPageHome.getImgLogoCicle()));
        imgLogoCicle.isDisplayed();

        List<WebElement> notifNewUser = driver.findElements(elementPageHome.getNotifNewUser());
        boolean isPresent = notifNewUser.size() > 0;

        if (isPresent) {
            WebElement buttonNotifClose = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageHome.getButtonNotifClose()));
            buttonNotifClose.click();
        }

        WebElement buttonCreateCompany = wait.until(ExpectedConditions
                .presenceOfElementLocated(elementPageHome.getButtonCreateCompany()));
        buttonCreateCompany.isDisplayed();
    }

    @Then("user can see Tab Container")
    public void user_can_see_tab_container() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonHome = wait.until(ExpectedConditions
                .presenceOfElementLocated(elementPageHome.getButtonHome()));

        buttonHome.isDisplayed();

        WebElement buttonNotification = wait.until(ExpectedConditions
                .presenceOfElementLocated(elementPageHome.getButtonNotification()));

        buttonNotification.isDisplayed();

        WebElement buttonSearch = wait.until(ExpectedConditions
                .presenceOfElementLocated(elementPageHome.getButtonSearch()));

        buttonSearch.isDisplayed();

        WebElement buttonMenu = wait.until(ExpectedConditions
                .presenceOfElementLocated(elementPageHome.getButtonMenu()));

        buttonMenu.isDisplayed();
    }
}
