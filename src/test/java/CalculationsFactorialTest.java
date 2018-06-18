import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculationsFactorialTest {
    private Integer input;
    private BigInteger expectedOutput;

    public CalculationsFactorialTest(Integer input, BigInteger expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, new BigInteger("1")},
                {1, new BigInteger("1")},
                {2, new BigInteger("2")},
                {3, new BigInteger("6")},
                {8, new BigInteger("40320")},
                {10, new BigInteger("3628800")},
                {16, new BigInteger("20922789888000")},
                {20, new BigInteger("2432902008176640000")},
        });
    }

    @Test
    public void calculateFactorial() throws Exception {
        assertEquals(expectedOutput, Calculations.calculateFactorial(input));
    }

}