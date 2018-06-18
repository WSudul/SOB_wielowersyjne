import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Factorial {

    public static Integer recursiveInt(int n) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> integerFuture = executor.submit(new RecursiveInt(Factorial::recursiveIntCalculation, n));

        try {
            return integerFuture.get(RecursiveInt.kTimeout, RecursiveInt.kTimeUnit);
        } catch (Exception e) {
            System.out.println("Exception caught while waiting for result: " + e.getMessage());
            integerFuture.cancel(true);
            return null;
        }


    }

    private static Integer recursiveIntCalculation(int n) {
        try {
            if (n == 1 || n == 0)
                return 1;
            else if (n < 0)
                return null;

            Integer temporaryResult = recursiveIntCalculation(n - 1);
            if (temporaryResult == null) {
                return null;
            }

            return temporaryResult * n;
        } catch (StackOverflowError e) {
            System.out.println(" StackOverflowErrorException caught: " + e.getMessage());
            return null;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException Exception caught: " + e.getMessage());
            return null;
        }
    }

    public static Double iterativeDouble(double n) {
        double result=1; double n_copy=n;
        if (n < 0) return null;
        else if (0 == n) return 1d;
        else{
            while (n_copy>0) {
                result = result * n_copy;
                n_copy--;
            }
        }
        return result;
    }

    public static Long iterativeLong(long n) {
        long result=1; long n_copy=n;
        if (n < 0) return null;
        else if (0 == n) return 1l;
        else{
            while (n_copy>0) {
                result = result * n_copy;
                n_copy--;
            }
        }
        return result;
    }
}

