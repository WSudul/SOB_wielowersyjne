import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertNull;

@RunWith(Parameterized.class)
public class CalculationsFactorialErrorsTest {
    private Integer input;

    public CalculationsFactorialErrorsTest(Integer input) {
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object> data() {
        return Arrays.asList(new Object[]{
                32, 64, 10000, -1, -8});
    }

    @Test
    public void calculateFactorial() throws Exception {
        assertNull(Calculations.calculateFactorial(input));
    }
}