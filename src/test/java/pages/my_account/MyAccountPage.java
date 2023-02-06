package pages.my_account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_abstract.MainPage;
import pages.my_account.address_book.AddressBookPage;
import pages.my_account.order_history.OrderHistoryPage;

public class MyAccountPage extends MainPage {

    private static final String MY_ACCOUNT_PAGE_LINKS_PATH = "//div[@class='myaccountbox']/ul/li/a";

    @FindBy(xpath = MY_ACCOUNT_PAGE_LINKS_PATH + "[@href='https://automationteststore.com/index.php?rt=account/account']")
    private WebElement accountDashboard;

    @FindBy(xpath = MY_ACCOUNT_PAGE_LINKS_PATH + "[@href='https://automationteststore.com/index.php?rt=account/wishlist']")
    private WebElement myWishlistLink;

    @FindBy(xpath = MY_ACCOUNT_PAGE_LINKS_PATH + "[@href='https://automationteststore.com/index.php?rt=account/edit']")
    private WebElement editAccountDetailsLink;

    @FindBy(xpath = MY_ACCOUNT_PAGE_LINKS_PATH + "[@href='https://automationteststore.com/index.php?rt=account/password']")
    private WebElement changePasswordLink;

    @FindBy(xpath = MY_ACCOUNT_PAGE_LINKS_PATH + "[@href='https://automationteststore.com/index.php?rt=account/address']")
    private WebElement manageAddressBookLink;

    @FindBy(xpath = MY_ACCOUNT_PAGE_LINKS_PATH + "[@href='https://automationteststore.com/index.php?rt=account/history']")
    private WebElement orderHistoryLink;

    @FindBy(xpath = MY_ACCOUNT_PAGE_LINKS_PATH + "[@href='https://automationteststore.com/index.php?rt=account/transactions']")
    private WebElement transactionHistoryLink;

    @FindBy(xpath = MY_ACCOUNT_PAGE_LINKS_PATH + "[@href='https://automationteststore.com/index.php?rt=account/download']")
    private WebElement downloadsLink;

    @FindBy(xpath = MY_ACCOUNT_PAGE_LINKS_PATH + "[@href='https://automationteststore.com/index.php?rt=account/notification']")
    private WebElement notificationsLink;

    @FindBy(xpath = MY_ACCOUNT_PAGE_LINKS_PATH + "[@href='https://automationteststore.com/index.php?rt=account/logout']")
    private WebElement logoffLink;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public MyAccountPage clickAccountDashboardLink() {
        click(accountDashboard);

        return this;
    }

    public MyWishlistPage clickMyWishlistLink() {
        click(myWishlistLink);

        return new MyWishlistPage(getDriver());
    }

    public EditAccountDetailsPage clickEditAccountDetailsLink() {
        click(editAccountDetailsLink);

        return new EditAccountDetailsPage(getDriver());
    }

    public ChangePasswordPage clickChangePasswordLink() {
        click(changePasswordLink);

        return new ChangePasswordPage(getDriver());
    }

    public AddressBookPage clickManageAddressBookLink() {
        click(manageAddressBookLink);

        return new AddressBookPage(getDriver());
    }

    public OrderHistoryPage clickOrderHistoryLink() {
        click(orderHistoryLink);

        return new OrderHistoryPage(getDriver());
    }

    public TransactionHistoryPage clickTransactionHistoryLink() {
        click(transactionHistoryLink);

        return new TransactionHistoryPage(getDriver());
    }

    public DownloadsPage clickDownloadsLink() {
        click(downloadsLink);

        return new DownloadsPage(getDriver());
    }

    public NotificationsPage clickNotificationsLink() {
        click(notificationsLink);

        return new NotificationsPage(getDriver());
    }

    public LogoutPage clickLogoffLink() {
        click(logoffLink);

        return new LogoutPage(getDriver());
    }
}
