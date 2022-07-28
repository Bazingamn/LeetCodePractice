package nowcoder.hj1;

import java.util.HashSet;
import java.util.Scanner;

public class LastWordLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            String str = in.nextLine();
//            StringBuilder sb = new StringBuilder();
//            sb.append(str);
//            int size = str.length();
//            int addZero = 8 - size % 8; //最后一行要添加的0的个数
//            while ((addZero > 0) && (addZero < 8)) {
//                sb.append(0);
//                addZero--;
//            }
//            String newStr = sb.toString();
//            while (newStr.length() > 0) {
//                System.out.println(newStr.substring(0, 8));
//                newStr = newStr.substring(8);
//            }
//        }

        while (in.hasNext()) {
            String s = in.nextLine();
            System.out.println(Integer.parseInt(s.substring(2,s.length()), 16));
        }
    }
}
