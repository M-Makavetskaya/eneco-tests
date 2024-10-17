package org.eneco.tests.cucumber;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.annotations.Feature;
import org.eneco.tests.config.Configs;
import org.eneco.tests.ui.HomePage;
import org.junit.Assert;

import java.util.Map;

@Feature
@Slf4j
public class HomePageDefinitions {

    private HomePage homePage;

    private static final Configs configs = new Configs();

    @Given("^Home page is opened$")
    public void openHomePage() {
        String url = configs.getProperty("homepage.url");
        homePage.openAt(url);
    }

    @When("^User fills in post code and house number$")
    public void userFillInAddress(DataTable data) {
        Map<String, String> address = data.asMap(String.class, String.class);
        homePage.fillInPostalCode(address.get("Postal_code"));
        homePage.fillInHouseNbr(address.get("House_number"));
    }

    @Then("^Correct address is found (.+)$")
    public void verifyAddress(String address) {
        Assert.assertTrue("Correct address is found", homePage.isCorrectAddressPresent(address));
        homePage.clickOnNext();
    }
}
