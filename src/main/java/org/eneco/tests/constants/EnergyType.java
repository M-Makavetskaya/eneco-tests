package org.eneco.tests.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnergyType implements OptionButton {
    ELECTRICITY_AND_GAS("electricityAndGas"),
    GAS("gas"),
    ELECTRICITY("electricity");

    private String value;

}
