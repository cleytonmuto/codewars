import java.util.List;

public class SmileFaces {

    public SmileFaces() {

    }

    private void run() {

    }

    public static int countSmileys(List<String> arr) {
        // Just Smile :)
        String[] validSmiles = {":)", ":D", ";)", ";D", ":-)", ":-D", ";-)", ";-D", ":~)", ":~D", ";~)", ";~D"};
        int count = 0;
        for(String elem : arr) {
            boolean found = false;
            for(String valid : validSmiles) {
                if (elem.equals(valid)) {
                    found = true;
                }
            }
            if (found) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        new SmileFaces().run();
    }
}