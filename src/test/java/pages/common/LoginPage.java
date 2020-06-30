package pages.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.Browser;

public class LoginPage extends AbstractPage
{
    public LoginPage(Browser browser)
    {
        super(browser);
    }

    @FindBy(id = "membership-modal-login-button")
    public WebElement loginButton;

    @FindBy(className = "membership-container__phone-login")
    public WebElement phoneNumberInputBar;

    @FindBy(id = "verifyOtpButton")
    public WebElement verifyOTPButton;

    @FindBy(id = "phoneNumberToVerify-error")
    public WebElement otpCodeError;

    @FindBy(id = "login-tab")
    public WebElement loginModal;
}
