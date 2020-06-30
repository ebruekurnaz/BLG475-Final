package pages.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.Browser;

public class ProductPage extends AbstractPage
{
    public ProductPage(Browser browser)
    {
        super(browser);
    }


    @FindBy(id = "product-detail-note-textarea")
    public WebElement productNoteBar;

    @FindBy(className = "note-submit-button")
    public WebElement noteSubmitButton;

    @FindBy(id = "input_unit_alternate_20000027130004")
    public WebElement piecesCheckbox;

    @FindBy(css = "#product-page .product-page-in .product-info .basket-process .product-detail-center--actions .add-product .action .part.product-plus")
    public WebElement productPlusButton;

    @FindBy(className = "close")
    public WebElement closeButton;

    @FindBy(className = "campaign-modal-dismiss-button")
    public WebElement closeCampaignButton;

    @FindBy(xpath = "//*[@id='alternativeProductChoice']/option[1]")
    public WebElement productAlternativeChoice;

    @FindBy(css = ".cart-page-box__body .select-box select")
    public WebElement productAlternativeButton;

    @FindBy(id = "in-cart-next-button")
    public WebElement confirmButton;

    @FindBy(css = "#sidebar #cart-info .cart-bottom-area button.button.next-button")
    public WebElement nextButton;

    @FindBy(css = ".registered-address .address-box .active-address .arrow-area .arrow-bar")
    public WebElement selectDeliveryAddress;

    @FindBy(css = ".registered-address .address-box .address-box-dropdown .list:last-child")
    public WebElement selectedAddress;

    @FindBy(className = "delivery-time-note__textarea")
    public WebElement orderNoteInput;

    @FindBy(id = "garanti-pay-list-item")
    public WebElement garantiPaymentMethod;

    @FindBy(css = "#product-page .product-page-in .product-info .basket-process button.button.orange")
    public WebElement addToBasketButton;

}
