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
    public int array11(int[] data, int index) {
        if (data == null || index < 0 || index > data.length-1) {
            return -1;
        }

        int count = 0;
        if (data[index] == 11) {
            count += 1;
        }

        if (index == data.length-1) {
            return count;
        } else {
            return count+array11(data, index+1);
        }
    }

    public int strCount(String text, String sub) {
        if (text == null || sub == null || sub.length() == 0) {
            return -1;
        }

        if (text.length() < sub.length()) {
            return 0;
        }

        if (text.substring(0, sub.length()).equals(sub)) {
            return 1 + strCount(text.substring(sub.length()), sub);
        }

        return strCount(text.substring(1), sub);
    }

    public boolean strCopies(String text, String sub, int n) {
        if (text == null || sub == null || sub.length() == 0 || n < 0) {
            return false;
        }

        if (text.length() < sub.length()) {
            return (n <= 0);
        }

        if (text.substring(0, sub.length()).equals(sub)) {
            return strCopies(text.substring(1), sub, n - 1);
        }

        return strCopies(text.substring(1), sub, n);
    }

    public int strDist(String text, String sub) {
        if (text == null || sub == null || sub.length() == 0) {
            return -1;
        }

        if (text.indexOf(sub) == -1) {
            return 0;
        }

        if (text.substring(0, sub.length()).equals(sub) && text.substring(text.length()-sub.length()).equals(sub)) {
            return text.length();
        }

        if (!text.substring(0, sub.length()).equals(sub)) {
            return strDist(text.substring(1), sub);
        }

        return strDist(text.substring(0, text.length() - 1), sub);
    }
}