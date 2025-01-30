package e4HomePages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterForm extends BasePage{
    @FindBy (id = "FirstName")
    private WebElement firstNameInput;
    @FindBy (id = "LastName")
    private WebElement lastNameInput;
    @FindBy (id = "Email")
    private WebElement emailInput;
    @FindBy (id = "CellPhone")
    private WebElement mobileNumber;
    @FindBy (xpath = "//label[@for='Password' and text()='Parola ']/..//input")
    private WebElement personalPassword;
    @FindBy (id = "ConfirmPassword")
    private WebElement confirmPassword;
    @FindBy (xpath = "//label[@for='DisabledSendNewsLetter']")
    private WebElement checkbox;

    public RegisterForm(WebDriver driver) {
        super(driver);
    }

    public void fillRegisterForm(){
        fillFirstNameInput();
        fillLastNameInput();
        fillEmailInput();
        fillMobileNumber();
        fillPassword();
        fillConfirmPassword();
        clickOnCheckBox();
    }


    public void fillFirstNameInput(){
        elementsHelper.fillElement(firstNameInput, "FirstName");
    }

    public void fillLastNameInput(){
        elementsHelper.fillElement(lastNameInput, "Alexandru");
    }

    public void fillEmailInput(){
        elementsHelper.keyboardEnters(emailInput, Keys.BACK_SPACE);
        elementsHelper.fillElement(emailInput, "alex.adrian@gmail.com");
    }

    public void fillMobileNumber(){
        elementsHelper.fillElement(mobileNumber, "754520115");
    }

    public void fillPassword(){
        elementsHelper.fillElement(personalPassword, "dfedre4");
    }

    public void fillConfirmPassword(){
        elementsHelper.fillElement(confirmPassword, "dfedre4");
    }

    public void clickOnCheckBox(){
        elementsHelper.clickElement(checkbox);
    }

    @Override
   public void isPageLoaded() {
    }
}
