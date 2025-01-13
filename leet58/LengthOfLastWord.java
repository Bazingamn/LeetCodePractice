public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length-1].length();
    }

    public static int lengthOfLastWord2(String s) {
        s = s.trim();
        return s.length() - s.lastIndexOf(" ") - 1;
    }

    public static int lengthOfLastWord3(String s) {
        s = s.trim();
        return s.substring(s.lastIndexOf(" ") + 1).length();
    }

    public static int lengthOfLastWord4(String s) {
        int index = s.length() - 1;
        while (s.charAt(index) == ' ') {
            index--;
        }
        int end = index;
        while (index >=0 && s.charAt(index) != ' ') {
            index --;
        }
        return end - index;
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
