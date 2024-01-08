public class Scramblies {

    public Scramblies() {

    }

    private void run() {

    }

    public static boolean scramble(String str1, String str2) {
        int[] frequency = new int[(int) 'z' + 1];
        for (int k = 0; k < str1.length(); k++) {
            frequency[(int) str1.charAt(k)]++;
        }
        for (int k = 0; k < str2.length(); k++) {
            frequency[(int) str2.charAt(k)]--;
        }
        for (int k = 0; k < frequency.length; k++) {
            if (frequency[k] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Scramblies().run();
    }
}