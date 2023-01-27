package stepDefinition;

import config.setUp;
import object.pageWelcome;
import helper.gesture;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.net.MalformedURLException;
import java.time.Duration;

public class welcome extends setUp {

    pageWelcome elementPageWelcome = new pageWelcome();

    gesture gesture = new gesture();

    @Given("user is at application homepage")
    public void user_is_at_application_homepage() throws MalformedURLException, InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonSkip = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageWelcome.getButtonSkip()));
        buttonSkip.isDisplayed();

        WebElement imgLogo = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageWelcome.getImgLogo()));
        imgLogo.isDisplayed();

        WebElement buttonYes = wait.until(ExpectedConditions.presenceOfElementLocated((elementPageWelcome.getButtonYes())));
        buttonYes.isDisplayed();

    }

    @When("user clicks skip button")
    public void user_clicks_skip_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonSkip = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageWelcome.getButtonSkip()));
        buttonSkip.isDisplayed();
        buttonSkip.click();

    }

    @Then("user can access the login page")
    public void user_can_access_the_login_page() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonToLoginPage = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageWelcome.getButtonToLoginPage()));
        buttonToLoginPage.isDisplayed();
    }

    @When("user clicks yes button")
    public void user_clicks_yes_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        WebElement buttonYes = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageWelcome.getButtonYes()));
        buttonYes.isDisplayed();
        buttonYes.click();
    }

    @When("user swipe the screen on loop")
    public void user_swipe_the_screen_on_loop() {
        while (driver.findElements(elementPageWelcome.getButtonToLoginPage()).size() == 0) {
            gesture.swipe(driver, 0.8, 0.5,0.2, 0.5);
        }
    }
}
