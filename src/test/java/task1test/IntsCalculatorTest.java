package task1test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task1.Ints;
import task1.IntsCalculator;

public class IntsCalculatorTest {
    @Test
    public void getCalculation_validArgument_success() {
        //given
        Ints intsCalc = new IntsCalculator();
        final int argA = 5;
        final int argB = 10;

        final int expSum = 15;
        final int expMult = 50;
        final int expPow = 9765625;

        //when
        final int resultSum = intsCalc.sum(argA, argB);
        final int resultMult = intsCalc.mult(argA, argB);
        final int resultPow = intsCalc.pow(argA, argB);

        //then
        Assertions.assertEquals(expSum, resultSum);
        Assertions.assertEquals(expMult, resultMult);
        Assertions.assertEquals(expPow, resultPow);

    }
}
