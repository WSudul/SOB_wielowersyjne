public class Fibonacci {

    public static int recursiveInt(int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return recursiveInt(n - 1) + recursiveInt(n - 2);
    }

    public static double iterativeDouble (double n){
        double f1=1; double f2=1; double tmp;

        if (n<0) return Double.parseDouble(null);
        else if (n<=2) return 1;
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
