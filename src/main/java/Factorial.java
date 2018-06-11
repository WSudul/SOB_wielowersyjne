public class Factorial {

    public static int recursiveInt(int n) {
        int result;
        if (n == 1 || n == 0)
            return 1;

        result = recursiveInt(n - 1) * n;
        return result;
    }
}
