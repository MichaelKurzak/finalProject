package travel;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class findeFlay {

    private WebDriver driver;
    private String phpTravelsSSite = "https://www.phptravels.net/index.php";

    @Given("an open browser with https://www.phptravels.net/index.php")
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        // open Chrome instance
        driver = new ChromeDriver();
        // maximize
        driver.manage().window().maximize();
        // open https://www.phptravels.net/index.php
        driver.get(phpTravelsSSite);

    }

    @When("click flights")
    public void clickFlay() {
        WebElement flights = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/nav/ul/li[2]/a"));
        flights.click();
    }

    @And("click round trip")
    public void clickTrip() {
        WebElement roundTrip = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div/div/form/div/div[1]/div[1]/div[2]"));
        roundTrip.click();
    }

    @And("put city form")
    public void cityForm() {
        WebElement fromCity = driver.findElement(By.xpath("//*[@id='s2id_location_from']"));
        fromCity.sendKeys("WAW");
    }

    @And("put city to")
    public void cityTo() {
        WebElement toCity = driver.findElement(By.xpath("//*[@id='s2id_location_to']"));
        toCity.click();
        toCity.sendKeys("JFK");
    }

    @And("put depart date")
    public void departDate() {
        WebElement departDateClick = driver.findElement(By.id("id=FlightsDateStart"));
        departDateClick.click();
    }
//        selenium.click("id=FlightsDateStart");
//        selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[7]/following::div[15]");
//        selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[8]/following::div[16]");
//        selenium.click("id=FlightsDateEnd");

    @And("put return date")
    public void returnDate() {
        WebElement returnDate = driver.findElement(By.id("FlightsDateStart"));
        returnDate.click();
    }

    @Then("tear down")
    public void tearDown() {
        //driver.quit();
    }

}
