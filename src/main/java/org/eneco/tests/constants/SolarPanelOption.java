package org.eneco.tests.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SolarPanelOption implements OptionButton{

    I_GENERATE_ELECTRICITY("hasPanels"),
    I_DONT_GENERATE_ELECTRICITY("noPanels");

    private String value;
}
