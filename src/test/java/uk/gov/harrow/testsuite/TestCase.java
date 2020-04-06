package uk.gov.harrow.testsuite;

import org.testng.annotations.Test;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.testbase.TestBase;

public class TestCase extends TestBase {

    HomePage homePage = new HomePage();

    @Test
    public void varifyUserShouldClickOnLoginOrRegisterLink(){
        homePage.clickOnElementLoginOrRegisterLink();
    }

    @Test
    public void varifyUserShouldClickOnServicesButton(){
        homePage.clickOnElementServicesLink();
    }
}
