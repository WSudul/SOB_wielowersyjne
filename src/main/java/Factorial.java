public class Factorial {

    public static Integer recursiveInt(int n) {
        try {
            int result;

            if (n == 1 || n == 0)
                return 1;
            else if (n < 0)
                return null;

            result = recursiveInt(n - 1) * n;
            return result;
        } catch (StackOverflowError e) {
            System.out.println("Exception caught: " + e.getMessage());
            return null;
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
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

