package org.eneco.tests.ui;

import org.openqa.selenium.By;

public class PersonalDataPage extends BasePage {


    public void fillInFirstName(String firstName) {
        find(By.name("firstName")).sendKeys(firstName);
    }

    public void fillInInitials(String initials) {
        find(By.name("initials")).sendKeys(initials);
    }

    public void fillInLastName(String lastname) {
        find(By.name("surname")).sendKeys(lastname);
    }

    public void fillInDateOfBth(String dateOfBth) {
        find(By.name("day")).sendKeys(dateOfBth.split("-")[0]);
        find(By.name("month")).sendKeys(dateOfBth.split("-")[1]);
        find(By.name("year")).sendKeys(dateOfBth.split("-")[2]);
    }

    public void fillInTelephone(String phoneNumber) {
        find(By.name("phoneNumber")).sendKeys(phoneNumber);
    }

    public void fillInEmail(String email) {
        find(By.name("emailAddress")).sendKeys(email);
    }
}
