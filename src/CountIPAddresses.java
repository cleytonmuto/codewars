public class CountIPAddresses {

    public CountIPAddresses() {

    }

    public static long ipsBetween(String start, String end) {
        String[] startToken = start.split("\\.");
        long startAddress = 0L;
        for (int k = 0; k < startToken.length; k++) {
            startAddress += (long) (Math.pow(256,3 - k) * Double.valueOf(startToken[k]));
        }
        String[] endToken = end.split("\\.");
        long endAddress = 0L;
        for (int k = 0; k < endToken.length; k++) {
            endAddress += (long) (Math.pow(256,3 - k) * Double.valueOf(endToken[k]));
        }
        return (long) Math.abs(endAddress - startAddress);
    }

    private void run() {
        System.out.println(ipsBetween( "10.0.0.0", "10.0.0.50" ));
    }

    public static void main(String[] args) {
        new CountIPAddresses().run();
    }

}
