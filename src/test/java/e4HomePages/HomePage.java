package e4HomePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy (id = "agreeWithCookies")
    private WebElement agreeCookies;

    @FindBy (xpath = "//span[@class='RO']")
    private WebElement homePageButton;

    @FindBy (xpath = "//span[@onclick=\"ToggleFloatingLogin()\"]")
    private WebElement createaccountButton;

    @FindBy (xpath = "//a[@title='Creare cont nou']")
    private WebElement createNewAccount;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void actionsOnHomePage(){
        clickOnCreateAccountButton();
        clickOnNewAccountButton();
    }

    public void acceptCookies(){
        elementsHelper.clickElement(agreeCookies);
    }

    public void clickOnCreateAccountButton(){
        elementsHelper.clickElement(createaccountButton);
    }

    public void clickOnNewAccountButton(){
        elementsHelper.clickElement(createNewAccount);
    }

    public void goBackToHomePage(){
        elementsHelper.clickElement(homePageButton);
    }

    @Override
   public void isPageLoaded() {
    }
}
