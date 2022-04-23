package AdressPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class addressPage {

    @FindBy(name = "address1")
    private WebElement addressInput;

    @FindBy(name = "city")
    private WebElement cityInput;

    @FindBy(name = "postcode")
    private WebElement postcodeInput;

    @FindBy(name = "phone")
    private WebElement phoneInput;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/footer/button")
    private WebElement saveButton;

    public addressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void fillForm(String address1, String city, String postcode, String phone) {
        this.addressInput.sendKeys(address1);
        this.cityInput.sendKeys(city);
        this.postcodeInput.sendKeys(postcode);
        this.phoneInput.sendKeys(phone);
    }

    public void saveButton() {
        saveButton.click();
    }


}







