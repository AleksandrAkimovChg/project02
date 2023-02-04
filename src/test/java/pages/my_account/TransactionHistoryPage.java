package pages.my_account;

import org.openqa.selenium.WebDriver;
import pages.ITable;
import pages.base_abstract.MainPage;

public class TransactionHistoryPage extends MainPage implements ITable {
    public TransactionHistoryPage(WebDriver driver) {
        super(driver);
    }
}
