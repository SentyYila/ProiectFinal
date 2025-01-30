package e4HomeTest;

import e4HomePages.HomePage;
import e4HomePages.RegisterForm;
import e4HomePages.SearchBarPage;
import e4HomePages.ShoppingPage;
import org.testng.annotations.Test;
import static extentUtility.ExtentManager.logEvents;
import static extentUtility.ReportEventType.*;

public class e4HomeTest extends BaseTest{

    @Test
    public void e4HomeProiectFinal() {
        HomePage homePage = new HomePage(driver);
        homePage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if the HomePage is loaded correctly");
        homePage.acceptCookies();
        SearchBarPage searchBarPage= new SearchBarPage(driver);
        searchBarPage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if the SearchPage is loaded correctly");
        searchBarPage.searchForInvalidItems();
        logEvents(INFO_STEP, "Use the search bar to search for non-existing items");
        homePage.goBackToHomePage();
        logEvents(PASS_STEP, "Going to the HomePage after the previous flow");
        searchBarPage.searchForValidItems();
        logEvents(INFO_STEP, "Use the search bar to search for existing items");
        RegisterForm registerForm = new RegisterForm(driver);
        registerForm.isPageLoaded();
        logEvents(PASS_STEP, "Verify if the RegisterPage is loaded correctly");
        homePage.actionsOnHomePage();
        registerForm.fillRegisterForm();
        logEvents(INFO_STEP, "Fill the form from the RegisterFormPage");
        homePage.goBackToHomePage();
        logEvents(PASS_STEP, "Going to the HomePage after the previous flow");
        ShoppingPage shoppingPage = new ShoppingPage(driver);
        shoppingPage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if the ShoppingPage is loaded correctly");
        shoppingPage.buyItemsFromSite();
        logEvents(INFO_STEP, "Select items and add them to the cart");
        homePage.goBackToHomePage();
        logEvents(PASS_STEP, "Return to HomePage");
    }
}
