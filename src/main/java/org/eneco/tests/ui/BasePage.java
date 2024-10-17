package org.eneco.tests.ui;

import net.serenitybdd.annotations.WhenPageOpens;
import net.serenitybdd.core.pages.PageObject;
import org.eneco.tests.constants.OptionButton;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class BasePage extends PageObject {

    private final By SUBMIT_BUTTON_LOCATOR = By.xpath(".//button[@type='submit']");
    private String optionButtonFormat = ".//button[@value='%s']";

    @WhenPageOpens
    public void whenOpens() {
        getDriver().manage().window().maximize();
    }

    public void selectOptionButton(OptionButton option) {
        find(By.xpath(String.format(optionButtonFormat, option.getValue()))).click();
    }

    public void clickOnNext() {
        withAction().moveToElement(find(SUBMIT_BUTTON_LOCATOR)).perform();
        find(SUBMIT_BUTTON_LOCATOR).click();
    }

}
