package leetCode75.easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * LeetCode 75 746. 使用最小花费爬楼梯
 * 给你一个整数数组 cost ，其中 cost[i] 是从楼梯第 i 个台阶向上爬需要支付的费用。
 * 一旦你支付此费用，即可选择向上爬一个或者两个台阶。
 * 
 * 你可以选择从下标为 0 或下标为 1 的台阶开始爬楼梯。
 * 请你计算并返回达到楼梯顶部的最低花费。
 * 
 * 示例 1：
 * 输入：cost = [10,15,20]
 * 输出：15
 * 解释：你将从下标为 1 的台阶开始。
 * - 支付 15 ，向上爬两个台阶，到达楼梯顶部。
 * 总花费为 15 。
 * 
 * 示例 2：
 * 输入：cost = [1,100,1,1,1,100,1,1,100,1]
 * 输出：6
 * 解释：你将从下标为 0 的台阶开始。
 * - 支付 1 ，向上爬两个台阶，到达下标为 2 的台阶。
 * - 支付 1 ，向上爬两个台阶，到达下标为 4 的台阶。
 * - 支付 1 ，向上爬两个台阶，到达下标为 6 的台阶。
 * - 支付 1 ，向上爬一个台阶，到达下标为 7 的台阶。
 * - 支付 1 ，向上爬两个台阶，到达下标为 9 的台阶。
 * - 支付 1 ，向上爬一个台阶，到达楼梯顶部。
 * 总花费为 6 。
 */
public class Practice001_746 {

    // グローバル変数 global variable
    // private ArrayList<String> headListGlobal = new ArrayList<>();

    public Practice001_746() {
        System.out.println("Run Practice001_746. ");
    }

    public void runBefore(String[] param_1, String[] param_2) {
		System.out.println("Run Practice001_746.");
	}

    /**
     * 
     * @param 配列 cost
     * @return
     */
    public int minCostClimbingStairs_746_try01(int[] cost) {

        // 両端を定義
        int left = 1;
        int rigth = 2;
        int count = 1;

        while (left <= rigth ) {


            count++;
        }
        System.out.println("実行回数：" + count);

        return 0 ;
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
