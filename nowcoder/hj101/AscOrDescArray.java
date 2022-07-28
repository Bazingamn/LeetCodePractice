package nowcoder.hj101;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AscOrDescArray {

    public static void sortArray(Integer[] pArray, int flag) {
        //升序
        if (flag == 0) {
            Arrays.sort(pArray, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return 01 - o2;
                }
            });
        }
        //降序
        else {
            Arrays.sort(pArray, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            Integer[] numbers = new Integer[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }
            int flag = scanner.nextInt();
            sortArray(numbers, flag);
            for (Integer i: numbers) {
                System.out.print(i + " ");
            }
        }
    }
}

