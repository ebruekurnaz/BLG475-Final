package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import pages.common.CategoryPage;
import pages.common.LoginPage;
import pages.common.MainPage;
import pages.common.ProductPage;
import tests.AbstractTest;

import java.util.List;

public class GeneratedTest extends AbstractTest
{
    private WebElement findTypeByName(String name, List<WebElement> types){
        for (WebElement type: types) {
            if (type.getText().toLowerCase().contains(name.toLowerCase()))
                return type;
        }
        return null;
    }

    @Test
    @DisplayName("Test of the scenario proposed in the second question")
    public void testGeneratedScenario(){
        MainPage mainPage = new MainPage(browser);
        browser.waitAndClick(mainPage.fruitVegetablesMenu);
        browser.waitAndClick(mainPage.fruitCategory);

        CategoryPage categoryPage = new CategoryPage(browser);
        if(categoryPage.cookieDismissButton.isDisplayed())
            browser.waitAndClick(categoryPage.cookieDismissButton);

        //browser.waitAndClick(categoryPage.sortItemsLink);
        browser.waitAndClick(mainPage.brandSearchInput);
        String searchedBrand = "Reyondan";
        browser.waitAndSendKeys(mainPage.brandSearchInput, searchedBrand);

        WebElement selectedBrand = findTypeByName(searchedBrand, categoryPage.typeList);
        if (selectedBrand == null)
            Assert.fail("Wanted product type not found in the list");
        browser.waitAndClick(selectedBrand);

        WebElement selectedType = findTypeByName("Elma", categoryPage.typeList);
        if (selectedType == null)
            Assert.fail("Wanted product type not found in the list");
        browser.waitAndClick(selectedType);

        browser.waitAndSendKeys(categoryPage.productSearchBar, "granny");
        browser.waitAndClick(categoryPage.firstListedItem);

        ProductPage productPage = new ProductPage(browser);

        browser.waitAndSendKeys(productPage.productNoteBar, "Example Note");
        browser.waitAndClick(productPage.noteSubmitButton);

        browser.waitAndClick(categoryPage.addBasket);

        LoginPage loginPage = new LoginPage(browser);
        boolean isLoginModalDisplayed;
        try{
            isLoginModalDisplayed = loginPage.loginModal.isDisplayed();
        }catch (NoSuchElementException e){
            isLoginModalDisplayed = false;
        }
        Assert.assertTrue(isLoginModalDisplayed);

        browser.waitAndSendKeys(loginPage.phoneNumberInputBar, context.getInternalProps().getPhoneNumber());
        loginPage.loginButton.click();

        loginPage.verifyOTPButton.click();
        try {
            if(productPage.closeButton.isDisplayed())
                browser.waitAndClick(productPage.closeButton);

        }catch (NoSuchElementException e){

        }
        try {
            if (productPage.wisCloseButton.isDisplayed())
                browser.waitAndClick(productPage.wisCloseButton);
        }catch (NoSuchElementException e){

        }

        browser.waitAndClick(productPage.addToBasketButton);
        browser.waitAndClick(productPage.piecesCheckbox);
        browser.waitAndClick(productPage.productPlusButton);

        browser.waitAndClick(mainPage.shoppingBasketButton);
        browser.waitAndClick(mainPage.goToBasketButton);

        if(productPage.closeCampaignButton.isDisplayed())
            browser.waitAndClick(productPage.closeCampaignButton);

        browser.waitAndClick(productPage.productAlternativeButton);
        browser.waitAndClick(productPage.productAlternativeChoice);
        browser.waitAndClick(productPage.confirmButton);

        browser.waitAndClick(productPage.selectDeliveryAddress);
        browser.waitAndClick(productPage.selectedAddress);
        browser.waitAndSendKeys(productPage.orderNoteInput, "Example Order Note");
        browser.waitAndClick(productPage.nextButton);

        browser.waitAndClick(productPage.nextButton);
        browser.waitAndClick(productPage.garantiPaymentMethod);
        Assert.assertTrue(productPage.nextButton.isDisplayed());
    }
}
