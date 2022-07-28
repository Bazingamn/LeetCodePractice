/**
 * 给你 k 种面值的硬币，面值分别为 c1, c2 ... ck，每种硬币的数量无限，
 * 再给一个总金额 amount，问你最少需要几枚硬币凑出这个金额，如果不可能凑出，算法返回 -1 。
 * coins 中是可选硬币面值，amount 是目标金额
 */
public class MakeChange {

    public int coinChange(int[] coins, int amount){
        //base case
        if (amount == 0) return 0;
        return -1;
    }

}
