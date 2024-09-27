package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

    @When("filter Z to A order")
    public void filterZToAOrder() {
        homePage.clickFilter();
        homePage.selectSortCriteria();
    }

    @Then("verify the products are in Z to A order")
    public void verifyTheProductsAreInZToAOrder() {

        Assert.assertTrue(homePage.isSorted());

    }
}
