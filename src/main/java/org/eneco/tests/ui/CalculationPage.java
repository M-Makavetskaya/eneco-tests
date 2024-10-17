package org.eneco.tests.ui;

import org.eneco.tests.constants.OptionButton;
import org.openqa.selenium.By;

public class CalculationPage extends BasePage {

    public void inputElectricityHighValue(String value) {
        find(By.xpath(".//input[@name='usageElectricityHigh']")).sendKeys(value);
    }

    public void inputElectricityLowValue(String value) {
        find(By.xpath(".//input[@name='usageElectricityLow']")).sendKeys(value);
    }

    public void inputGasValue(String value) {
        find(By.xpath(".//input[@name='usageGas']")).sendKeys(value);
    }
}
