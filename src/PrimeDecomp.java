public class PrimeDecomp {

    public PrimeDecomp() {

    }

    private void run() {
        System.out.println(factors(18018));
    }

    public static String factors(int n) {
        int last = -1, power = 1;
        // your code
        while (n % 2 == 0) {
            if (last == 2) {
                power++;
            }
            last = 2;
            n /= 2;
        }
        String result = "";
        if (last == 2) {
            if (power == 1) {
                result += "(2)";
            }
            else {
                result += "(2**" + power + ")";
            }
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            power = 1;
            while (n % i == 0) {
                if (last == i) {
                    power++;
                }
                last = i;
                n /= i;
            }
            if (last == i) {
                if (power == 1) {
                    result += "(" + last + ")";
                }
                else {
                    result += "(" + last + "**" + power + ")";
                }
            }
        }

        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (n > 2) {
            result += "(" + n + ")";
        }
        return result;
    }

    public static void main(String[] args) {
        new PrimeDecomp().run();
    }
}
