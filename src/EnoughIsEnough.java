import java.util.LinkedHashMap;
import java.util.ArrayList;

public class EnoughIsEnough {

    public EnoughIsEnough() {

    }

    private void run() {
        int[] array = deleteNth(new int[] {1, 2, 3, 1, 2, 1, 2, 3 }, 2);
        for (int k = 0; k < array.length; k++) {
            if (k > 0) {
                System.out.print(",");
            }
            System.out.print(array[k]);
        }
        System.out.println();
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        //Code here ;)
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int k = 0; k < elements.length; k++) {
            if (map.get(elements[k]) == null) {
                map.put(elements[k],1);
                if (maxOccurrences > 0) {
                    list.add(elements[k]);
                }
            }
            else {
                int value = map.get(elements[k]);
                value++;
                if (value <= maxOccurrences) {
                    map.put(elements[k],value);
                    list.add(elements[k]);
                }
            }
        }
        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        return result;
    }

    public static void main(String[] args) {
        new EnoughIsEnough().run();
    }
}
