package org.eneco.tests.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Gender implements OptionButton{

    DHR("dhr"),
    MVR("false");

    private String value;
}
