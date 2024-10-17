package org.eneco.tests.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MoveOutOption implements OptionButton{

    I_MOVE_OUT("true"),
    I_DONT_MOVE_OUT("false");


    private String value;
}
