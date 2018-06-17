public class Fibonacci {

    public static Integer recursiveInt(int n) {
        try {
            if (n < 0) {
                return null;
            }
            if (n == 0)
                return 0;
            else if (n == 1)
                return 1;
            else {

                Integer result1 = recursiveInt(n - 1);
                if (result1 == null)
                    return null;
                Integer result2 = recursiveInt(n - 2);
                if (result2 == null)
                    return null;
                return result1 + result2;
            }

        } catch (StackOverflowError e) {
            System.out.println("Exception caught: " + e.getMessage());
            return null;
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
            return null;
        }
    }

    public static Double iterativeDouble(double n) {
        double f1=1; double f2=1; double tmp;

        if (n < 0) return null;
        else if (n == 0) return 0d;
        else if (n <= 2) return 1d;
        else{
            for(int i=3; i<=n; i++){
                tmp = f1+f2;
                f1=f2;
                f2=tmp;
            }
            return f2;
        }
    }

    public static Long iterativeLong(long n) {
        long f1=1; long f2=1; long tmp;

        if (n < 0) return null;
        else if (n == 0) return 0l;
        else if (n <= 2) return 1l;
        else{
            for(int i=3; i<=n; i++){
                tmp = f1+f2;
                f1=f2;
                f2=tmp;
            }
            return f2;
        }
    }


}
