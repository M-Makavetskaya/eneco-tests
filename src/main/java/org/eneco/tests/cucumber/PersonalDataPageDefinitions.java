package org.eneco.tests.cucumber;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.eneco.tests.constants.Gender;
import org.eneco.tests.constants.YesNoOption;
import org.eneco.tests.ui.PersonalDataPage;

import java.util.Map;

public class PersonalDataPageDefinitions {

    PersonalDataPage personalDataPage;


    @When("User fills in Personal data and goes to Final page")
    public void fillInPersonalData(DataTable dataTable) {
        // apply delivery date
        personalDataPage.clickOnNext();

        personalDataPage.selectOptionButton(YesNoOption.YES);
        personalDataPage.clickOnNext();

        Map<String, String> personalData = dataTable.asMap(String.class, String.class);

        personalDataPage.selectOptionButton(Gender.valueOf(personalData.get("Gender")));

        personalDataPage.fillInFirstName(personalData.get("First_Name"));
        personalDataPage.fillInInitials(personalData.get("Initials"));
        personalDataPage.fillInLastName(personalData.get("Last_Name"));
        personalDataPage.fillInDateOfBth(personalData.get("Date_of_brh"));
        personalDataPage.clickOnNext();

        personalDataPage.fillInTelephone(personalData.get("Telephone"));
        personalDataPage.fillInEmail(personalData.get("Email"));
        personalDataPage.clickOnNext();

    }
}
