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
 * LeetCode 75 1137. 第 N 个泰波那契数
 * 泰波那契序列 Tn 定义如下：
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 * 
 * 示例 1：
 * 输入：n = 4
 * 输出：4
 * 解释：
 * T_3 = 0 + 1 + 1 = 2
 * T_4 = 1 + 1 + 2 = 4
 * 
 * 示例 2：
 * 输入：n = 25
 * 输出：13895371
 */
public class Practice001_1173 {

    // グローバル変数 global variable
    // private ArrayList<String> headListGlobal = new ArrayList<>();

    public Practice001_1173() {
        System.out.println("Run Practice001_1173. ");
    }

    public void runBefore(String[] param_1, String[] param_2) {
		System.out.println("Run Practice001_1173.");
	}

    /**
     * 
     * @param 整数 n
     * @return
     */
    public int tribonacci_1173_try01(int n) {

        // TODO
        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n ; i++) {

            dp[i] =  dp[i -1] + dp[i - 2]  + dp[i - 3];

        }



        return dp[n] ;
    }
	
    /**
     * 
     * @param 範囲 n, 予想値 pick
     * @return
     */
    public int guessNumber_374_try01(int n, int pick) {

        // 両端を定義
        int left = 1;
        int rigth = n;
        int count = 1;

        while (left <= rigth ) {
            // 二分法
            int mid = left + (( rigth - left) / 2); 
            // Forward declaration of guess API.获取猜测结果
            int result = guess(mid, pick);

            if (result == 0) {
                break ;
            }
            if (result == 1) {
                left = mid + 1;
            }
            if (result == -1) {
                rigth = mid - 1;
            }

            count++;
        }
        System.out.println("実行回数：" + count);

        return pick ;
    }

    public int guess(int mid ,int pick) {

        if(pick > mid) {
            return 1;
        } 
        else if(pick < mid) {
            return -1;
        }
        else if(pick ==  mid) {
            return 0;
        }
        return 9;
    }

    /**
     * Binary Search Tree
     * 特別なところ：左枝と右枝
     * 左枝：必ず親枝によって小
     * 右枝：必ず親枝によって大きい
     * 
     * @param matrix
     * @return
     * @throws Exception
     */
    public TreeNode searchBST_700_try01(TreeNode root, int val) {

        // 入力確認、最後leafなら子供がないので、「null」を返却
        if (null == root || root.isLeaf()) {
            return null;
        }

        // TreeNodeから値を文字化して枝番を取得する
        String rootStr =root.toString().substring(root.toString().length() -1);
        // 文字の枝番を取得して数字化に転換する
        int rootInt  = Integer.parseInt(rootStr);

        //余計なソース
        // TreeNodeの子供を取得
        TreeNode leftBranch = root.getChildAt(0);
        // TreeNodeから値を文字化して枝番を取得する
        String leftBranchStr =leftBranch.toString().substring(leftBranch.toString().length() -1);
        // 文字の枝番を取得して数字化に転換する
        int leftBranchInt  = Integer.parseInt(leftBranchStr);
        
        // TreeNodeの子供を取得
        TreeNode rightBranch = root.getChildAt(1);
        // TreeNodeから値を文字化して枝番を取得する
        String rightBranchStr =rightBranch.toString().substring(rightBranch.toString().length() -1);
        // 文字の枝番を取得して数字化に転換する
        int rightBranchInt  = Integer.parseInt(rightBranchStr);
        //余計なソース

        //今のブランチを確認
        System.out.println("今のブランチ" + root.toString());
        if (rootInt >  val) {
            return searchBST_700_try01(leftBranch, val);
        }

        if (rootInt < val) {
            return searchBST_700_try01(rightBranch, val);
        }

        // rootInt == val の場合
        return root ;
    }

    /**
     * Recursionを使う
     * 
     * @param matrix
     * @return
     * @throws Exception
     */
    public int maxDepth_104_try02(TreeNode root ) throws Exception {

        // 入力確認、最後leafなら、「1」を返却
        if (null == root) {
            return 0;
        } 
        
        //今のブランチを確認
        System.out.println("今のブランチ" + root.toString());
        if (root.isLeaf()) {
            return 1;
        }

        // 大きい方を取得
        return Math.max(
            maxDepth_104_try02(
                root.getChildAt(0)), 
            maxDepth_104_try02(
                root.getChildAt(1))) + 1;
    }
}
