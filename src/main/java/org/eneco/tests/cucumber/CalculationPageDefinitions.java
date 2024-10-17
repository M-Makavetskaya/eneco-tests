package org.eneco.tests.cucumber;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.eneco.tests.constants.EnergyType;
import org.eneco.tests.constants.MoveOutOption;
import org.eneco.tests.constants.SolarPanelOption;
import org.eneco.tests.constants.UsageOption;
import org.eneco.tests.ui.CalculationPage;

import java.util.Map;

public class CalculationPageDefinitions {

    private CalculationPage calculationPage;

    @When("^User selects energy type: (\\w+)$")
    public void selectEnergyType(EnergyType type) {
        calculationPage.selectOptionButton(type);
        calculationPage.clickOnNext();
    }

    @When("^User selects usage: (\\w+)$")
    public void selectUsage(UsageOption option) {
        calculationPage.selectOptionButton(option);
        calculationPage.clickOnNext();
    }

    @When("^User selects solar panel option: (\\w+)$")
    public void selectSolarPanelOption(SolarPanelOption option) {
        calculationPage.selectOptionButton(option);
        calculationPage.clickOnNext();
    }

    @When("^User selects move out option: (\\w+)$")
    public void selectMoveOutOption(MoveOutOption option) {
        calculationPage.selectOptionButton(option);
        calculationPage.clickOnNext();
    }
    @When("^User fills in usage value:$")
    public void fillInUsage(DataTable data) {
        Map<String, String> usageValues = data.asMap(String.class, String.class);
        calculationPage.inputElectricityHighValue(usageValues.get("Normal_electricity_usage"));
        calculationPage.inputElectricityLowValue(usageValues.get("Off_peak_electricity_usage"));
        calculationPage.inputGasValue(usageValues.get("Gas_usage"));
        calculationPage.clickOnNext();
    }
}
