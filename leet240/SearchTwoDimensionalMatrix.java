package leet240;


/**
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 */
public class SearchTwoDimensionalMatrix {
}


/**
 * 一、暴力解法
 */
class Solution1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}


/**
 * 二、二分法搜索
 */
class Solution2 {
    //二分查找
    private boolean binarySearch(int[][] matrix, int target, int start, boolean vertical){
        int lo = start;
        int hi = vertical ? matrix[0].length-1 : matrix.length-1;
        while (hi >= lo){
            int mid = (hi - lo) / 2;
            if (vertical){
                //搜索一列
                if (matrix[start][mid] < target){
                    lo = mid + 1;
                } else if (matrix[start][mid] > target){
                    hi = mid - 1;
                } else {
                    return true;
                }
            } else {
                //搜索一列
                if (matrix[mid][start] < target){
                    lo = mid + 1;
                } else if (matrix[mid][start] > target){
                    hi = mid - 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        return false;
    }
}