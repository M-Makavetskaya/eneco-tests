package org.eneco.tests.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ContractType implements OptionButton{

    FIXED("fixed");

    private String value;
}
