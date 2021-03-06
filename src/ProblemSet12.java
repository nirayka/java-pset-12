import java.util.ArrayList;

public class ProblemSet12 {

    public long factorial(int n) {
        if (n <= 0) {
            return -1;
        } else if (n == 1) {
            return 1;
        } else {
            return (n * factorial(n-1));
        }
    }

    public long fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public long triangle(int rows) {
        if (rows < 0) {
            return -1;
        } else if (rows == 0) {
            return 0;
        } else if (rows == 1) {
            return 1;
        } else {
            return rows + triangle(rows-1);
        }
    }

    public long sumDigits(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else {
            return (n % 10 + sumDigits(n / 10));
        }
    }

    public long powerN(int base, int exponent) {
        if (exponent < 1 || base < 1) {
            return -1;
        } else if (exponent != 1) {
            return base * powerN(base, exponent-1);
        } else {
            return base;
        }
    }

    public String changeXY(String text) {

    }

    public int array11(int[] data, int index) {

    }

    public int strCount(String text, String sub) {

    }

    public boolean strCopies(String text, String sub, int n) {

    }

    public int strDist(String text, String sub) {

    }
}