public class MissingLetter {

    public MissingLetter() {

    }

    private void run() {

    }

    public static char findMissingLetter(char[] array) {
        for (int k = 1; k < array.length; k++) {
            if (array[k] == (char) (array[k - 1] + 2)) {
                return (char)(array[k - 1] + 1);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        new MissingLetter().run();
    }
}
