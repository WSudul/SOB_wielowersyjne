import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertNull;

@RunWith(Parameterized.class)
public class CalculationsFibonacciErrorTest {
    private Integer input;

    public CalculationsFibonacciErrorTest(Integer input) {
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object> data() {
        return Arrays.asList(new Object[]{
                -1, -8, 128, 10000});
    }

    @Test
    public void calculateFibonacci() throws Exception {
        System.out.println("input=" + input);
        assertNull(Calculations.calculateFibonacci(input));
    }
}