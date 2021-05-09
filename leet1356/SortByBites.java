package leet1356;

import java.util.*;

/**
 * 给你一个整数数组 arr 。请你将数组中的元素按照其二进制表示中数字 1 的数目升序排序。
 * 如果存在多个数字二进制中 1 的数目相同，则必须将它们按照数值大小升序排列。
 * 返回排序后的数组。
 */
public class SortByBites {
    public static void main(String[] args) {
        System.out.println(new Solution().get(7));
    }
}

//暴力解法
class Solution {
    public int[] sortByBits(int[] arr) {
        //1、遍历数组，计算每个元素的二进制表示
        //2、计算每个元素二进制里的1的数目
        //3、依次根据二进制数目比较大小，如果数目一样，再比较原数值大小
        //4、打印输出

        int[] bit = new int[1001];
        List<Integer> list = new ArrayList<>();
        for (int x:arr) {
            list.add(x);
            bit[x] = get(x);
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (bit[o1] != bit[o2])
                    return bit[o1] - bit[o2];
                else
                    return o1 - o2;
            }
        });
    }

    //计算十进制转二进制后1的个数
    public int get(int x){
        int res = 0;
        while (x != 0){
            res += x%2;
            x/=2;
        }
        return res;
    }
}
