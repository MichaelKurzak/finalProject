package Pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class websiteRegistration {

    private WebDriver driver;

    @Given("an open browser with https://tester.codersguru.pl/")
    public void openWebsiteRegistration() {
        // Uruchom nowy egzemplarz przeglądarki Chrome
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do aavtarin.com
        driver.get("https://tester.codersguru.pl/");
    }

    @When("enter email address (.*)")
    public void enterEmail(String email) {
        // znajdz pole email
        WebElement emailFind = driver.findElement(By.name("email"));
        // Wyczyść teskst zapisany w elemencie
        emailFind.clear();
        // Wpisz email
        emailFind.sendKeys(email);
        // Potwierdz email
        emailFind.submit();
    }

    @And("press the button Prywatnie")
    public void pressButtonPrywatnie() {
        // znajdzpole  nazwe Prywatnie
        WebElement findPressButton = driver.findElement(By.id("person"));
        if (findPressButton.isSelected()) {
        } else {
            findPressButton.click();
        }
    }

//    @And("check email(.*)")
//    public void checkEmail(String email) {
//        // check email exist
//        WebElement findCheckEmail = driver.findElement(By.name("fos_user_registration_form[email]"));
//        System.out.println(findCheckEmail);
//        //Assert.assertTrue(findCheckEmail.getText().contains(email));
//    }

    @And("enter first name (.*)")
    public void enterFirstName(String firstName) {
        // znajdz pole nazwa uzytkownika
        WebElement userName = driver.findElement(By.name("fos_user_registration_form[name]"));
        // Wyczyść teskst zapisany w elemencie
        userName.clear();
        // Wpisz first name
        userName.sendKeys(firstName);
    }

    @And("enter last name (.*)")
    public void enterLastName(String lastName) {
        // znajdz pole last name
        WebElement serchLastName = driver.findElement(By.name("fos_user_registration_form[lastname]"));
        // Wyczyść teskst zapisany w elemencie
        serchLastName.clear();
        // Wpisz last name
        serchLastName.sendKeys(lastName);
    }

    @And("enter password (.*)")
    public void enterPassword(String password) {
        // znajdz pole hasło
        WebElement findPasswords = driver.findElement(By.name("fos_user_registration_form[plainPassword][first]"));
        // Wyczyść teskst zapisany w elemencie
        findPasswords.clear();
        // Wpisz password
        findPasswords.sendKeys(password);
    }

    @And("enter again password (.*)")
    public void enterageinPassword(String againPassword) {
        // znajdz pole ponownie wpisz hasło
        WebElement findAgainPasswords = driver.findElement(By.name("fos_user_registration_form[plainPassword][second]"));
        // Wyczyść teskst zapisany w elemencie
        findAgainPasswords.clear();
        // Wpisz ponownie password
        findAgainPasswords.sendKeys(againPassword);
    }

    @And("enter City (.*)")
    public void enterCity(String city) {
        // znajdz pole city
        WebElement findCity = driver.findElement(By.name("form[city]"));
        // Wyczyść teskst zapisany w elemencie
        findCity.clear();
        // Wpisz password
        findCity.sendKeys(city);
    }

    @And("enter Zip (.*)")
    public void enterZip(String zip) {
        // znajdz pole hasło
        WebElement passwords = driver.findElement(By.name("form[postal_code]"));
        // Wyczyść teskst zapisany w elemencie
        passwords.clear();
        // Wpisz password
        passwords.sendKeys(zip);
        // Prześlij formularz
        passwords.submit();
    }

    @And("enter street (.*)")
    public void enterStreet(String street) {
        // find the element
        WebElement findStreet = driver.findElement(By.name("form[street]"));
        // clear the elements
        findStreet.clear();
        // enter in the element
        findStreet.sendKeys(street);
    }

    @And("enter number of home (.*)")
    public void enterNumberHome(String numberHome) {
        // find the element
        WebElement findNumberHome = driver.findElement(By.name("form[number]"));
        // clear the elements
        findNumberHome.clear();
        // enter in the element
        findNumberHome.sendKeys(numberHome);
    }

    @And("check the button Regulamin")
    public void pressButtonRegulamin() {
        // find the elements
        WebElement findButtonRegulamin = driver.findElement(By.xpath("//*[@id='registration-main-form']/div[12]/input"));
        findButtonRegulamin.click();
    }

    @Then("click button registration")
    public void registration() {
        // find the elements
        WebElement findButtonregistration = driver.findElement(By.id("register-submit-btn"));
        findButtonregistration.click();
    }

    @And("check if an account has been created (.*)")
    public void checkCreatacount(String firstName) {

        // assert that success message appeared
        WebElement successMessage = driver.findElement(By.id("user-name"));
        Assert.assertTrue(successMessage.getText().contains(firstName));

    }


}

