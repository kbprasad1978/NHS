/*
package StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPageTest1 {

    private WebDriver driver;
    @Given("I am a jobseeker on NHS Jobs website")
    public void iAmAJobseekerOnNHSJobsWebsite() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.jobs.nhs.uk/candidate/search");
        driver.manage().window().maximize();
        System.out.println("SearchPage is displayed");

    }

    @When("I put my preferences into the Search functionality")
    public void iPutMyPreferencesIntoTheSearchFunctionality() {
        driver.findElement(By.xpath("//*[@id=\"keyword\"]")).sendKeys("Test Manager");
        System.out.println("Entered Test Manager");

    }

    @Then("I should get a list of jobs which matches my preferences")
    public void iShouldGetAListOfJobsWhichMatchesMyPreferences() {
        driver.findElement(By.xpath("//*[@id=\"search\"]")).click();

        System.out.println("List of jobs are displayed");
    }

    @And("sort my search results with the newest Date Posted")
    public void sortMySearchResultsWithTheNewestDatePosted() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement sortDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sort")));

        Select select = new Select(sortDropdown);
        select.selectByVisibleText("Date Posted (newest)");
        System.out.println("Latest job is displayed at the very top of the result");

    }
}*/
