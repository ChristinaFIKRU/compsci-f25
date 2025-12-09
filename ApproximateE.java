// Christina F
// Apporximate E 
// 11/11/25

import java.math.BigDecimal; //cus we cant use regular float aka double, float 
import java.math.MathContext; // to control precision 
import java.math.RoundingMode; // to round it at least half up

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class ApproximateE {
    public static void main(String[] args) {
        // Create 25-digit precision context
        MathContext mc = new MathContext(25, RoundingMode.HALF_UP);

        System.out.println("Approximating e using the series expansion:");
        System.out.println("i\t\tApproximate e 25 digs\n");

        for (int i = 100; i <= 1000; i += 100) {
            BigDecimal e = computeE(i, mc);
            // Format output to 25 digs after decimal
            System.out.printf("i = %-4d --> e ≈ %s%n", i, formatDecimal(e, 25));
        }
    }

    // Compute e = 1 + 1/1! + 1/2! + ... + 1/i!
    public static BigDecimal computeE(int i, MathContext mc) {
        BigDecimal e = BigDecimal.ONE;
        BigDecimal factorial = BigDecimal.ONE;

        for (int n = 1; n <= i; n++) {
            factorial = factorial.multiply(BigDecimal.valueOf(n));
            e = e.add(BigDecimal.ONE.divide(factorial, mc));
        }

        return e;
    }

    // Helper to format BigDecimal to given decimal places
    public static String formatDecimal(BigDecimal value, int scale) {
        value = value.setScale(scale, RoundingMode.HALF_UP);
        return value.toPlainString();
    }
}

