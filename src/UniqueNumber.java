public class UniqueNumber {

    public static double findUniq(double arr[]) {
        // Do the magic
        double repeated = 0.0;
        if (arr[0] == arr[1]) {
            repeated = arr[0];
            for (int k = 2; k < arr.length; k++) {
                if (arr[k] != repeated) {
                    return arr[k];
                }
            }
        }
        return arr[0] == arr[2] ? arr[1] : arr[0];
    }
}
