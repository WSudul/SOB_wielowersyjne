import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class RecursiveInt implements Callable<Integer> {
    final public static long kTimeout = 5;
    final public static TimeUnit kTimeUnit = TimeUnit.SECONDS;

    private int n;
    private Function<Integer, Integer> function;

    RecursiveInt(Function<Integer, Integer> function, int n) {
        this.function = function;
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        return function.apply(n);
    }
}
