package nowcoder.hj7;

import java.util.*;

public class ApproximateValue {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        double v = scanner.nextDouble();
//        System.out.println(Math.round(v));

//        Scanner scanner = new Scanner(System.in);
//        int value = scanner.nextInt();
//        Set<Integer> set = new HashSet<>();
//        while (value  != 0) {
//            int num = value % 10;
//            if (set.add(num)) {
//                System.out.print(num);
//            }
//            value /= 10;
//        }

//        Scanner scanner = new Scanner(System.in);
//        String value = scanner.next();
//        int i = scanner.nextInt();
//        System.out.println(value.substring(0, i));

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt(), k = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            Arrays.sort(nums);
            for (int i = 0; i < k; i++) {
                System.out.print(nums[i]);
            }
            System.out.println();
        }

    }
}
