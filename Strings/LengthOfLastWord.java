public class LengthOfLastWord {
    // https://leetcode.com/problems/length-of-last-word/
    public int lengthOfLastWord(String s) {
        int a = 0, l = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                a = i;
                break;
            }
        }
        for (int i = a; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                a = i;
                break;
            }
            l++;

        }

        return l;
    }
}
