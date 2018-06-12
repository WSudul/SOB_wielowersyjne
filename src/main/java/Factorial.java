public class Factorial {

    public static int recursiveInt(int n) {
        int result;
        if (n == 1 || n == 0)
            return 1;

        result = recursiveInt(n - 1) * n;
        return result;
    }

    public static double iterativeDouble (double n){
        double result=1; double n_copy=n;
        if (n <0) return Double.parseDouble(null);
        else if (0==n) return 1;
        else{
            while (n_copy>0) {
                result = result * n_copy;
                n_copy--;
            }
        }
        return result;
    }
}

