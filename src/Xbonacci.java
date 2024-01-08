public class Xbonacci {

    public Xbonacci() {

    }

    private void run() {

    }

    public double[] tribonacci(double[] s, int n) {
        // hackonacci me
        if (n == 0) {
            return new double[] {};
        }
        if (n == 1) {
            return new double[] {s[0]};
        }
        if (n == 2) {
            return new double[] {s[0], s[1]};
        }
        double[] sequence = new double[n];
        for(int k = 0; k < 3; k++) {
            sequence[k] = s[k];
        }
        for(int k = 3; k < n; k++) {
            sequence[k] = sequence[k - 1] + sequence[k - 2] + sequence[k - 3];
        }
        return sequence;
    }

    public static void main(String[] args) {
        new Xbonacci().run();
    }
}