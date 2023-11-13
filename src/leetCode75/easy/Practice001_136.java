package leetCode75.easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

import javax.swing.tree.TreeNode;

  // https://www.bilibili.com/video/BV1Sk4y1F7Hg/?spm_id_from=333.337.search-card.all.click&vd_source=1b25179b469396007411858e0ce802b3
  // 泰波那契数 前3 總合
  // 費波那契数 前2 總合（黃金比例）
/*
 * LeetCode 75 136. 只出现一次的数字
 * 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
 * 
 * 示例 1 ：
 * 输入：nums = [2,2,1]
 * 输出：1
 * 
 * 示例 2 ：
 * 输入：nums = [4,1,2,1,2]
 * 输出：4
 * 
 * 示例 3 ：
 * 输入：nums = [1]
 * 输出：1
 */
// TODO

public class Practice001_136 {

    // グローバル変数 global variable
    // private ArrayList<String> headListGlobal = new ArrayList<>();

    public Practice001_136() {
        System.out.println("Run Practice001_136. ");
    }

    public void runBefore(String[] param_1, String[] param_2) {
		System.out.println("Run Practice001_136.");
	}

    /**
     * 
     * @param 整数 n
     * @return
     */
    public int singleNumber_try01(int[] n) {

        // // TODO
        // int[] dp = new int[n + 1];

        // dp[0] = 0;
        // dp[1] = 1;
        // dp[2] = 1;

        // for (int i = 3; i <= n ; i++) {

        //     dp[i] =  dp[i -1] + dp[i - 2]  + dp[i - 3];

        // }



        // return dp[n] ;
        return 0;
    }

}
