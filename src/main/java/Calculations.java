import java.math.BigInteger;

import static java.lang.Math.floor;

public class Calculations {

    private final static double kEpsilon = 1E-5d;

    private static boolean almostEqual(double a, double b, double eps) {
        return Math.abs(a - b) < eps;
    }

    private static BigInteger VoteOnResult(Integer intValue, Long longValue, Double doubleValue) {
        boolean isIntAndLongSame = (Long.valueOf(intValue).compareTo(longValue) == 0);
        boolean isLongAndDoubleSame = almostEqual(Double.valueOf(longValue), floor(doubleValue), kEpsilon);
        boolean isIntAndDoubleSame = almostEqual(Double.valueOf(longValue), floor(doubleValue), kEpsilon);

        if (isIntAndLongSame) {
            return BigInteger.valueOf(intValue);
        } else if (isIntAndDoubleSame && !isLongAndDoubleSame)
            return BigInteger.valueOf(intValue);
        else if (isLongAndDoubleSame && !isIntAndDoubleSame)
            return BigInteger.valueOf(longValue);
        else
            return null;
    }


    public static BigInteger calculateFactorial(int n) {
        Integer intValue = Factorial.recursiveInt(n);
        Long longValue = null; //todo
        Double doubleValue = null; //todo

        System.out.println("n: " + n + "\nintValue: " + intValue +
                "\nlongValue: " + longValue + "\ndoubleValue: " + doubleValue);


        return VoteOnResult(intValue, longValue, doubleValue);

    }

    public static BigInteger calculateFibonacci(int n) {
        Integer intValue = Fibonacci.recursiveInt(n);
        Long longValue = null; //todo
        Double doubleValue = null; //todo

        System.out.println("n: " + n + "\nintValue: " + intValue +
                "\nlongValue: " + longValue + "\ndoubleValue: " + doubleValue);

        return VoteOnResult(intValue, longValue, doubleValue);

    }
}
