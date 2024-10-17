package org.eneco.tests.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static java.time.Duration.ofSeconds;

public class OfferPage extends BasePage {

    public void goToPersonalDataStep() {
        withTimeoutOf(ofSeconds(3)).find(By.xpath(".//button[@data-label='Naar je gegevens']")).click();
    }

    public List<String> getPrices() {
        List<String> ramNumbers = new ArrayList<>();
        findAll(By.xpath(".//*[contains(@aria-label, 'per maand')]")).map(WebElement::getText).forEach(
                value -> ramNumbers.add(value.replace("^[-?0-9]+", ""))
        );
        return ramNumbers;
    }

    public List<String> getPersonalDataToCheck() {
        return findAll(By.xpath(".//*[text()='Persoonlijke gegevens']/ancestor::div[1]//p")).map(WebElement::getText);
    }

    public List<String> getAddressDataToCheck() {
        return findAll(By.xpath(".//*[text()='Adresgegevens']/ancestor::div[1]//p")).map(WebElement::getText);
    }
}
