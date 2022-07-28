package nowcoder.hj26;

import java.util.*;

public class ArraySort {

    public static String sort(String str) {
        //收集英文字母letters数组
        List<Character> letters = new ArrayList<>();
        for (char ch: str.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.add(ch);
            }
        }
        //对英文字母排序
        letters.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return Character.toLowerCase(o1) - Character.toLowerCase(o2);
            }
        });
        //新建stringbuilder用来存储排序后的字符串；
        // 依次遍历原字符串，如果第i个位置是字母，就插入letters，否则插入原数组第i个位置的字符。
        StringBuilder sb = new StringBuilder();
        for (int i = 0, j = 0; i < str.length(); i++) {
            //i用来遍历str，j用来遍历letters
            if (Character.isLetter(str.charAt(i))) {
                sb.append(letters.get(j++));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            System.out.println(sort(str));
        }

//        Set<Integer> set = new HashSet<>();

    }
}
