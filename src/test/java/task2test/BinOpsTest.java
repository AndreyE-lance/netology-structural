package task2test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task2.BinOps;

public class BinOpsTest {
    @Test
    public void getBin_validArgument_success(){
        //given
        final String argSum = "1101";
        final String expectedSum = "11010";

        final String argMult = "101";
        final String expectedMult = "11001";

        BinOps binOps = new BinOps();

        //when
        final String resultSum =  binOps.sum(argSum,argSum);
        final String resultMult = binOps.mult(argMult,argMult);

        //then
        Assertions.assertEquals(expectedSum, resultSum);
        Assertions.assertEquals(expectedMult, resultMult);

    }
}
