package uk.gov.harrow.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.gov.harrow.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Log in / Register")
    WebElement _loginlinkOrRegisterLink;

    @FindBy(xpath = "//span[@class='button__text'][contains(text(),'Services')]")
    WebElement _servicesBtn;

    public void clickOnElementLoginOrRegisterLink() {
        Reporter.log(" Click on Login/register link " + _loginlinkOrRegisterLink.toString() + "<br>");
        clickOnElement(_loginlinkOrRegisterLink);
        log.info(" Click on Login/register link " + _loginlinkOrRegisterLink.toString());
    }

    public void clickOnElementServicesLink() {
        Reporter.log(" Click on service button " + _servicesBtn.toString() + "<br>");
        clickOnElement(_servicesBtn);
        log.info(" Click on service button " + _servicesBtn.toString());
    }
}
