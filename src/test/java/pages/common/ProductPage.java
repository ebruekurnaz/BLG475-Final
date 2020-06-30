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

    @FindBy(className = "alternate-unit-label")
    public WebElement piecesCheckbox;

    @FindBy(className = "product-plus")
    public WebElement productPlusButton;

    @FindBy(className = "close")
    public WebElement closeButton;

    @FindBy(className = "campaign-modal-dismiss-button")
    public WebElement closeCampaignButton;

    @FindBy(xpath = "//*[@id='alternativeProductChoice']/option[1]")
    public WebElement productAlternativeChoice;

    @FindBy(css = ".cart-page-box__body .select-box select")
    public WebElement productAlternativeButton;

    @FindBy(className = "next-button")
    public WebElement confirmButton;

    @FindBy(css = ".registered-address .address-box .active-address .arrow-area .arrow-bar")
    public WebElement selectDeliveryAddress;

    @FindBy(css = ".registered-address .address-box .address-box-dropdown .list:last-child")
    public WebElement selectedAddress;

    @FindBy(className = "delivery-time-note__textarea")
    public WebElement orderNoteInput;

    @FindBy(id = "garanti-pay-list-item")
    public WebElement garantiPaymentMethod;

}
