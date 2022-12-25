package week1;

public class task2 {
    public static void main(String[] args) {
        System.out.println(divide_two_number(-43, -5));

    }

    public static double divide_two_number(double dividend, double divisor) {
        long sign = (dividend < 0 ^ divisor < 0) ? -1 : 1;
        //This is a ternary operator that assigns the value of -1 to the variable "sign"
        // if either the dividend or divisor is negative (but not both),
        // and assigns the value of 1 to "sign" if both the dividend and divisor are either positive or negative.
        // The expression (dividend < 0) ^ (divisor < 0) is a logical XOR operation that returns true
        // if either the dividend or divisor is negative, but not both.
        // The XOR operator (^) returns true if either of its operands is true, but not both.
        if (divisor == 0) throw new RuntimeException("divisor can not be 0");

        dividend = Math.abs(dividend); // update dividen and divisor to positive number.
        divisor = Math.abs(divisor);
        int result = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            result++;
        }
        if (sign == -1) {
            result = -result;
        }// if sign value is -1 then negate the value of the result.
        return result;
    }


}
