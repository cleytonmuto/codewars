public class FourSquares {

    public FourSquares() {

    }

    private boolean isSquare(int n) {
        return Math.floor(Math.sqrt(n)) == Math.ceil(Math.sqrt(n));
    }
    private void run() {
        for (int k = 0; k < 10; k++) {
            int n = 50000 + (int) (50000 * Math.random());
            int[] combination = find(n);
            while (n % 2 == 0) { // containsZeroOrOne(combination)
                n = 50000 + (int) (50000 * Math.random());
                combination = find(n);
            }
            System.out.println(n);
            print(combination);
        }
    }

    private boolean containsZeroOrOne(int[] array) {
        for (int k = 0; k < array.length; k++) {
            if (array[k] == 0 || array[k] == 1) {
                return true;
            }
        }
        return false;
    }

    private int[] find(int n) {
        if (isSquare(n)) {
            return new int[] {0, 0, 0, (int) Math.sqrt(n)};
        }
        final int LIMIT = (int) Math.sqrt(n);
        for (int a = 0; a <= LIMIT; a++) {
            for (int b = 0; b <= LIMIT; b++) {
                for (int c = 0; c <= LIMIT; c++) {
                    for (int d = 0; d <= LIMIT; d++) {
                        if (a * a + b * b + c * c + d * d == n) {
                            return new int[] {a, b, c, d};
                        }
                    }
                }
            }
        }
        return null;
    }

    private void print(int[] array) {
        String result = "{";
        for(int k = 0; k < array.length; k++) {
            if (k > 0) {
                result += ",";
            }
            result += String.valueOf(array[k]);
        }
        result += "}";
        System.out.println(result);
    }

    public static void main(String[] args) {
        new FourSquares().run();
    }
}