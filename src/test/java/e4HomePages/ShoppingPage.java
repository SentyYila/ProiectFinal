package e4HomePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ShoppingPage extends BasePage{
    @FindBy (xpath = "//a[@title=\"Philips\"]")
    private WebElement selectBrand;
    @FindBy (xpath = "//a[@class='tab__anchor ui-tabs-anchor' and @title='Culoare']")
    private WebElement colorMenu;
    @FindBy (xpath = "//label[@class='colors-filter__color' and @title='negru']")
    private WebElement selectColor;
    @FindBy (xpath = "//label[@class='labels-filter__item labels-filter__item--sale' and @title='Reducere']")
    private WebElement discount;
    @FindBy (xpath = "//label[@class='labels-filter__item labels-filter__item--available' and @title='În stoc']")
    private WebElement inStock;
    @FindBy (xpath = "//a[@class=\"submit add-to-cart button button-add-to-cart button-add-to-cart--product-item\" and @data-id=\"ca008fa8-05d7-5fd8-63c8-de49fc401b86\"]")
    private WebElement firstItem;
    @FindBy (id = "BackToStoreButton")
    private WebElement backToShopping;
    @FindBy (xpath = "//a[@class=\"submit add-to-cart button button-add-to-cart button-add-to-cart--product-item\" and @data-id=\"fcc522d5-fbba-6752-497f-cab7105ecb00\"]")
    private WebElement secondItem;


    public ShoppingPage(WebDriver driver) {
        super(driver);
    }

    public void buyItemsFromSite(){
        clickOnFavoriteBrand();
        clickOnColorMenu();
        clickOnFavoriteColor();
        selectDiscountItems();
        selectInStockItems();
        addItemsToCart();
    }

    public void clickOnFavoriteBrand(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(selectBrand).click(selectBrand).perform();
//        elementsHelper.clickElement(selectBrand);
    }

    public void clickOnColorMenu(){
        elementsHelper.clickElement(colorMenu);
    }

    public void clickOnFavoriteColor(){
        elementsHelper.waitForElement(selectColor);
        elementsHelper.clickElement(selectColor);
    }

    public void selectDiscountItems(){
        elementsHelper.clickElement(discount);
    }

    public void selectInStockItems(){
        elementsHelper.clickElement(inStock);
    }

    public void addItemsToCart(){
        elementsHelper.clickElement(firstItem);
        elementsHelper.waitForElement(backToShopping);
        elementsHelper.clickElement(backToShopping);
        Actions actions = new Actions(driver);
        actions.scrollToElement(secondItem).click(secondItem).perform();
    }


    @Override
   public void isPageLoaded() {

    }
}
