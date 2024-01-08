public class GreedDice {

    public GreedDice() {

    }

    private void run() {
        System.out.println(greedy(new int[] {5, 1, 3, 4, 1}));
        System.out.println(greedy(new int[] {1, 1, 1, 3, 1}));
        System.out.println(greedy(new int[] {2, 4, 4, 5, 4}));
    }

    public static int greedy(int[] dice){
        //code here
        int total = 0;
        int[] frequency = new int[7];
        for (int k = 0; k < dice.length; k++) {
            frequency[dice[k]]++;
        }
        for (int k = 0; k < 7; k++) {
            if (frequency[k] >= 3) {
                if (k == 1) {
                    total += 1000;
                }
                else if (k > 1) {
                    total += k * 100;
                }
                int count = 3;
                for (int j = 0; j < dice.length; j++) {
                    if (dice[j] == k && count > 0) {
                        dice[j] = 0;
                        count--;
                    }
                }
            }
        }
        for (int j = 0; j < dice.length; j++) {
            if (dice[j] == 1) {
                total += 100;
            }
            else if (dice[j] == 5) {
                total += 50;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        new GreedDice().run();
    }
}
