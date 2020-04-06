package uk.gov.harrow.pages;

import org.openqa.selenium.By;
import uk.gov.harrow.utility.Utility;

public class HomePage extends Utility {
    By loginlinkOrRegisterLink = By.linkText("Log in / Register");
    By servicesBtn = By.xpath("//span[@class='button__text'][contains(text(),'Services')]");

    public void clickOnElementLoginOrRegisterLink() {
        clickOnElement(loginlinkOrRegisterLink);
    }

    public void clickOnElementServicesLink() {
        clickOnElement(servicesBtn);
    }
}
