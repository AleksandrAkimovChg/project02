package pages.product_list.calvin_klein;

import org.openqa.selenium.WebDriver;
import pages.product_list.ProductDescriptionPage;

public class CKSecretObsessionPerfumePage extends ProductDescriptionPage<CKSecretObsessionPerfumePage> {

    public CKSecretObsessionPerfumePage(WebDriver driver) {
        super(driver);
    }

    protected CKSecretObsessionPerfumePage createProductDescriptionPage() {

        return new CKSecretObsessionPerfumePage(getDriver());
    }
}
