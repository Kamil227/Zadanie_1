package Zadania;

import AdressPage.addressPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.time.Duration;

public class zadanie1Steps {


    private AdressPage.addressPage addressPage;
    public WebDriver driver;




    @Given("user logged on account, add new address")
    public void userIsOnLoginnPage() {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("testtest123@gmail.com");
        WebElement psw = driver.findElement(By.name("password"));
        psw.sendKeys("qwerty");
        driver.findElement(By.id("submit-login")).click();
        driver.findElement(By.xpath("//*[@id=\"addresses-link\"]")).click();
        driver.findElement(By.xpath("//*[@data-link-action=\"add-address\"]")).click();

        addressPage = new addressPage(driver);

    }

    @When("user fill form {string}, {string}, {string}, {string}")
    public void userFillForm(String address, String city, String postcode, String phone) {
        addressPage.fillForm(address, city, postcode, phone);
    }


    @And("user clicks save")
    public void userClicksSave() {
        addressPage.saveButton();

    }

    @Then("user added a valid address")
    public void userAddedAValidAddress() {
        WebElement NewAddress = driver.findElement(By.xpath("//*[@id=\"notifications\"]/div/article"));

        Assertions.assertTrue(NewAddress.isDisplayed());
        System.out.println("Działa");
    }


    }






