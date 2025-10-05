package TestRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class LoginSteps {
    WebDriver driver;

    @Given("the user is on the login page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.get("https://yourapp.com/login");
    }

    @When("the user enters valid username and password")
    public void user_enters_valid_credentials() {
        driver.findElement(By.id("username")).sendKeys("validUser");
        driver.findElement(By.id("password")).sendKeys("validPass");
        driver.findElement(By.id("loginButton")).click();
    }

    @Then("they should be redirected to the dashboard")
    public void redirected_to_dashboard() {
        boolean isDashboardVisible = driver.findElement(By.id("dashboard")).isDisplayed();
        assert isDashboardVisible;
        driver.quit();
    }

    @When("the user enters a valid username and an incorrect password")
    public void user_enters_invalid_password() {
        driver.findElement(By.id("username")).sendKeys("validUser");
        driver.findElement(By.id("password")).sendKeys("wrongPass");
        driver.findElement(By.id("loginButton")).click();
    }

    @Then("they should see an error message")
    public void see_error_message() {
        boolean isErrorVisible = driver.findElement(By.id("errorMessage")).isDisplayed();
        assert isErrorVisible;
        driver.quit();
    }
}

