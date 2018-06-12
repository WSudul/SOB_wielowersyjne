import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculationsFibonacciTest {
    private Integer input;
    private BigInteger expectedOutput;

    public CalculationsFibonacciTest(Integer input, BigInteger expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, new BigInteger("1")},
                {1, new BigInteger("1")},
                {2, new BigInteger("1")},
                {3, new BigInteger("2")},
                {8, new BigInteger("21")},
                {10, new BigInteger("55")},
                {16, new BigInteger("987")},
                {32, new BigInteger("2178309")},
                {39, new BigInteger("63245986")},
                {64, new BigInteger("10610209857723")},
                {90, new BigInteger("2880067194370816120")},
        });
    }

    @Test
    public void calculateFibonacci() throws Exception {
        assertEquals(expectedOutput, Calculations.calculateFibonacci(input));
    }

}