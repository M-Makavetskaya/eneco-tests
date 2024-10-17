package org.eneco.tests.cucumber;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.eneco.tests.constants.ContractType;
import org.eneco.tests.ui.OfferPage;

import java.util.List;
import java.util.Map;

public class OfferPageDefinitions {

    OfferPage offerPage;

    @When("^User selects contract type: (\\w+)$")
    public void selectEnergyType(ContractType type) {
        offerPage.selectOptionButton(type);
        offerPage.clickOnNext();
    }

    @Then("Offer is correct:")
    public void verifyOfferPrices(DataTable data) {
        Map<String, String> expectedPrices = data.asMap(String.class, String.class);
        List<String> actualPrices = offerPage.getPrices();
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(actualPrices.get(0))
                .as("Expected Green electricity price should be %s", expectedPrices.get("Green_electricity")).isEqualTo(expectedPrices.get("Green_electricity"));
        softAssertions.assertThat(actualPrices.get(1))
                .as("Expected Gas price should be %s", expectedPrices.get("Gas")).isEqualTo(expectedPrices.get("Gas"));
        softAssertions.assertThat(actualPrices.get(2))
                .as("Expected Total price should be %s", expectedPrices.get("Total")).isEqualTo(expectedPrices.get("Total"));
        softAssertions.assertAll();
    }

    @When("User goes on Personal data step")
    public void goToNextStep() {
        offerPage.goToPersonalDataStep();
    }

}
