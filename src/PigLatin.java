public class PigLatin {
    public static String pigIt(String str) {
        // Write code here
        String[] token = str.split("\\s");
        String result = "";
        for (int k = 0; k < token.length; k++) {
            if (k > 0) {
                result += " ";
            }
            if (token[k].length() == 1 && !Character.isLetterOrDigit(token[k].charAt(0))) {
                result += token[k];
            }
            else {
                result += token[k].substring(1) + token[k].charAt(0) + "ay";
            }
        }
        return result;
    }
}