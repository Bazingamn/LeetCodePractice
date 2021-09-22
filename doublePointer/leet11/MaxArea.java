package doublePointer.leet11;

/**
 * 盛水最多的容器
 */
public class MaxArea {
}

/**
 * 双指针
 */
class Solution {
    public int maxArea(int[] height) {
        //双指针分别指向头和尾
        int l = 0, r = height.length - 1;
        //返回结果
        int ans = 0;
        while (l < r){
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r])
                ++l;
            else
                --r;
        }
        return ans;
    }
}