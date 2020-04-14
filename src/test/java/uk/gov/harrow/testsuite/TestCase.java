package uk.gov.harrow.testsuite;

import org.testng.annotations.Test;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.testbase.TestBase;

public class TestCase extends TestBase {

    HomePage homePage = new HomePage();

    @Test(priority = 2,groups = {"Sanity","Regression"})
    public void varifyUserShouldClickOnLoginOrRegisterLink(){
        homePage.clickOnElementLoginOrRegisterLink();
    }

    @Test(priority = 3,groups = {"Smoke","Regression"})
    public void varifyUserShouldClickOnServicesButton(){
        homePage.clickOnElementServicesLink();
    }
}
