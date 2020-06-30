package pages.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.AbstractPage;
import utils.Browser;

import java.util.List;

public class CategoryPage extends AbstractPage
{
    public CategoryPage(Browser browser)
    {
        super(browser);
    }

    @FindBy(className = "cookie-popup-dismiss")
    public WebElement cookieDismissButton;

    @FindBy(css = ".sub-category-product-list .list:nth-of-type(1) .product-card-button")
    public WebElement addBasket;

    @FindBy(linkText = "Önce En Düşük Fiyat")
    public WebElement sortItemsLink;

    @FindBy(xpath = "//a[@data-sort='once-en-dusuk-fiyat']")
    public WebElement lowestItemSort;

    @FindBy(xpath = "//a[@data-monitor-position='1']")
    public WebElement firstListedItem;

    @FindBy(xpath = "//a[@data-monitor-position='4']")
    public WebElement fourthListedItem;

    @FindBy(id = "product-search")
    public WebElement productSearchBar;

    @FindBy(className = "empty-search-message")
    public WebElement emptySearchWarning;

    @FindAll({@FindBy(how = How.CLASS_NAME,using = "brands-list-anchor")})
    public List<WebElement> typeList;

    @FindAll({@FindBy(className = "product-link")})
    public List<WebElement> items;
}
