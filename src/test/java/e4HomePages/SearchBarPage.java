package e4HomePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBarPage extends BasePage {
    @FindBy (xpath = "//input[@id='search-header-input']")
    private WebElement searchBar;

    @FindBy (xpath = "//input[@class='search-form__submit']")
    private WebElement searchButton;

    @FindBy (xpath = "//p[@class='result-info']")
    private WebElement errorMessage;
    public SearchBarPage(WebDriver driver) {
        super(driver);
    }

    public void searchForInvalidItems(){
        searchInvalidItem();
        clickOnSearchButton();
        elementsHelper.waitForElement(errorMessage);
        getErrorMessage();
    }

    public void searchForValidItems(){
        searchValidItems();
        clickOnSearchButton();
        getMessage();
    }

    public void searchInvalidItem(){
        elementsHelper.fillElement(searchBar, "guma turbo");
    }

    public void clickOnSearchButton(){
        elementsHelper.clickElement(searchButton);
    }

    public void getErrorMessage(){
        System.out.println(errorMessage.getText());
    }

    public void searchValidItems(){
        elementsHelper.fillElement(searchBar, "laptop");
    }

    public void getMessage(){
        System.out.println("Rezultate căutare pentru: laptop (20)");
    }


    @Override
    public void isPageLoaded() {
    }
}
