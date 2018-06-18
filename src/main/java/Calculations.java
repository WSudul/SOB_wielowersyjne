import java.math.BigInteger;

import static java.lang.Math.floor;

public class Calculations {

    private final static double kEpsilon = 1E-2d;

    private static boolean almostEqual(double a, double b, double eps) {
        return Math.abs(a - b) < eps;
    }

    private static BigInteger VoteOnResult(Integer intValue, Long longValue, Double doubleValue) {
        boolean isLongAndDoubleSame = (longValue != null && doubleValue != null)
                && (almostEqual(Double.valueOf(longValue), floor(doubleValue), kEpsilon));
        boolean isIntAndDoubleSame = (intValue != null && doubleValue != null)
                && almostEqual(Double.valueOf(intValue), floor(doubleValue), kEpsilon);
        boolean isIntAndLongSame = (intValue != null && longValue != null)
                && (Long.valueOf(intValue).compareTo(longValue) == 0);


        System.out.println("isLongAndDoubleSame=" + isLongAndDoubleSame);
        System.out.println("isIntAndDoubleSame=" + isIntAndDoubleSame);
        System.out.println("isIntAndLongSame=" + isIntAndLongSame);

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
        Long longValue = Factorial.iterativeLong(n);
        System.out.println("longValue=" + (longValue == null ? "null" : longValue.toString()));

        Double doubleValue = Factorial.iterativeDouble(n);
        System.out.println("doubleValue=" + (doubleValue == null ? "null" : String.format("%f", doubleValue)));

        Integer intValue = Factorial.recursiveInt(n);
        System.out.println("intValue=" + (intValue == null ? "null" : intValue.toString()));

        return VoteOnResult(intValue, longValue, doubleValue);

    }

    public static BigInteger calculateFibonacci(int n) {
        Long longValue = Fibonacci.iterativeLong(n);
        System.out.println("longValue=" + (longValue == null ? "null" : longValue.toString()));

        Double doubleValue = Fibonacci.iterativeDouble(n);
        System.out.println("doubleValue=" + (doubleValue == null ? "null" : String.format("%f", doubleValue)));

        Integer intValue = Fibonacci.recursiveInt(n);
        System.out.println("intValue=" + (intValue == null ? "null" : intValue.toString()));


        return VoteOnResult(intValue, longValue, doubleValue);

    }
}
