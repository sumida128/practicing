package leetCode75.easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * LeetCode 75 338. 猜数字大小
 * 给你一个整数 n ，对于 0 <= i <= n 中的每个 i ，
 * 计算其二进制表示中 1 的个数 ，
 * 返回一个长度为 n + 1 的数组 ans 作为答案。。
 * 
 * 示例 1：
 * 输入：n = 2
 * 输出：[0,1,1]
 * 解释：0 --> 0
 *      1 --> 1
 *      2 --> 10
 * 
 * 示例 2：
 * 输入：n = 5
 * 输出：[0,1,1,2,1,2]
 * 解释：0 --> 0
 *      1 --> 1
 *      2 --> 10
 *      3 --> 11
 *      4 --> 100
 *      5 --> 101
 */
public class Practice001_338 {

    // グローバル変数 global variable
    // private ArrayList<String> headListGlobal = new ArrayList<>();

    public Practice001_338() {
        System.out.println("Run Practice001_338. ");
    }

    public void runBefore(String[] param_1, String[] param_2) {
        System.out.println("Run Practice001_338.");
    }

    /**
     * 
     * @param 範囲 n, 予想値 pick
     * @return
     */
    public int[] countBits_338_try01(int n) {

        int[] ans = new int [n+ 1];
        for(int i = 0; i <= n; i++ ) {
            ans[i] = countOne(i);
        }
        return  ans;
    }

    public int countOne(int n) {

        int ans = 0;
        while (n != 0) {
            if((n & 1) == 1) {
                ++ans;
            }

            // 右方向 1桁に移動。（1010 >> 101）
            // いわゆる最右の 1桁を抜く
            n = n>>1;
        }
        return ans;
    }

    /**
     * 
     * @param 範囲 n, 予想値 pick
     * @return
     */
    public int[] countBits_338_try02(int n) {

        int[] ans = new int [n+ 1];
        ans[0] = 0;
        ans[1] = 1;
        for(int i = 2; i <= n; i++ ) {
            if(i % 2 == 0) {
                ans[i] = ans[i / 2];
            } else {
                ans[i] = ans[i / 2] +1;
            }
        }
        return  ans;
    }

}
