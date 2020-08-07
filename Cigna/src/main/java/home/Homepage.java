package home;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



import static webelements.HomepageWebElements.*;

public class Homepage extends WebAPI {

    @FindBy(how = How.LINK_TEXT,using = idvisNfamilyWebElement) public WebElement idvisNFamily;
    @FindBy(how = How.XPATH,using = idvisNfamilyWebElementText) public WebElement idvisNFamilyText;


    public void CignaIndividualFamily(){ idvisNFamily.click();}
    public void validateIndividualNFamily(String expectedResult){
        String actualResult=idvisNFamilyText.getText();
        Assert.assertEquals("Search Result not Displayed",expectedResult,actualResult);
    }

}
