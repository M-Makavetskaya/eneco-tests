package org.eneco.tests.cucumber;

import io.cucumber.java.en.Then;
import org.eneco.tests.ui.OfferPage;
import org.junit.Assert;

import java.util.List;

public class FinalPageDefinitions {

    OfferPage offerPage;

    @Then("Personal data is correct on final offer")
    public void verifyPersonalData(List<String> dataToCheck) {
        Assert.assertArrayEquals("Personal data is correct", offerPage.getPersonalDataToCheck().toArray(), dataToCheck.toArray());

    }

    @Then("Address data is correct on final offer")
    public void verifyAddressData(List<String> dataToCheck) {
        Assert.assertArrayEquals("Address data is correct", offerPage.getAddressDataToCheck().toArray(), dataToCheck.toArray());

    }
}
