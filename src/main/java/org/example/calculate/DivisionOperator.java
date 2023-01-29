package org.example.calculate;

import org.example.NewArtihmeticOperator;

public class DivisionOperator implements NewArtihmeticOperator {
    @Override
    public boolean supports(String operator) {
        return "/".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber operand1, PositiveNumber operand2) {
        return operand1.toInt() / operand2.toInt();
    }
}
