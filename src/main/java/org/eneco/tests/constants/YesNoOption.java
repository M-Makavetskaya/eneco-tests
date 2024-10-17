package org.eneco.tests.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum YesNoOption implements OptionButton{
    YES("true"),
    NO("false");

    private String value;

}
