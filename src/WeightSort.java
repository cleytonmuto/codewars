public class WeightSort {

    public WeightSort() {

    }

    private void run() {
        System.out.println(orderWeight("103 123 4444 99 2000"));
    }

    public static String orderWeight(String strng) {
        // your code
        String[] token = strng.split("\\s");
        if (token.length < 2) {
            return strng;
        }
        String[] array = new String[token.length];
        int[] sum = new int[token.length];
        for(int i = 0; i < array.length; i++) {
            array[i] = token[i];
            sum[i] = 0;
            for (int j = 0; j < token[i].length(); j++) {
                sum[i] += (int) (token[i].charAt(j) - '0');
            }
        }
        for (int i = 0; i < sum.length - 1; i++) {
            for (int j = i + 1; j < sum.length; j++) {
                if (sum[i] > sum[j] || sum[i] == sum[j] && array[i].compareTo(array[j]) > 0) {
                    int temp = sum[i];
                    sum[i] = sum[j];
                    sum[j] = temp;
                    String strTemp = array[i];
                    array[i] = array[j];
                    array[j] = strTemp;
                }
            }
        }
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                result += " ";
            }
            result += array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        new WeightSort().run();
    }
}