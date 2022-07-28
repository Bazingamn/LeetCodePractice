package offer11;

public class MinInRotatedNumbers {
}

class Solution {
    public int minArray(int[] numbers) {
        //声明i、j指针分别指向numbers的首端和末端
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j])
                i = m + 1;
            else if (numbers[m] < numbers[j])
                j = m;
            else {
                int x = i;
                for (int k = i + 1; k < j; k++) {
                    if (numbers[k] < numbers[x]) x = k;
                }
                return numbers[x];
            }
        }
        return numbers[i];
    }
}