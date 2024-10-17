package org.eneco.tests.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UsageOption implements OptionButton {

    I_FILL_IN_MY_USAGE("exactUsage"),
    HELP_ME_ESTIMATE("estimateUsage");

    private String value;
}
