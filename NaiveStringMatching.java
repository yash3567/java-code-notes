public class NaiveStringMatching {
    public static int findPattern(String text, String pattern) {
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            int j;
            for (j = 0; j < pattern.length(); j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == pattern.length()) {
                return i; // Pattern found at index i
            }
        }
        return -1; // Pattern not found
    }
}
