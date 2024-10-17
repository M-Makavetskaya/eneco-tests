package org.eneco.tests.ui;

import net.serenitybdd.annotations.WhenPageOpens;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class HomePage extends BasePage {

    @FindBy(xpath = ".//input[@name='postalCode']")
    private WebElement postalCodeField;

    @FindBy(xpath = ".//input[@name='houseNumber']")
    private WebElement houseNumberField;


    @WhenPageOpens
    @Override
    public void whenOpens() {
        super.whenOpens();
        // close Cookie dialog
        if (findAll(By.xpath(".//div[@role='alertdialog']")).size() > 0) {
            find(By.xpath(".//button[@data-label='Accepteren']")).click();
        }
    }

    public void fillInPostalCode(String postalCode) {
        postalCodeField.sendKeys(postalCode);
    }

    public void fillInHouseNbr(String houseNbr) {
        houseNumberField.sendKeys(houseNbr);

    }

    public boolean isCorrectAddressPresent(String address) {
        return !withTimeoutOf(Duration.ofSeconds(10))
                .findAll(By.xpath(String.format(".//div[@data-scope='AddressFinder']//span[contains(text(), '%s')]", address))).isEmpty();
    }
}
