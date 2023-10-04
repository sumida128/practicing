package leetCode75.easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * LeetCode 75 374. 猜数字大小
 * 每轮游戏，我都会从 1 到 n 随机选择一个数字。 请你猜选出的是哪个数字。
 * 如果你猜错了，我会告诉你，你猜测的数字比我选出的数字是大了还是小了。
 * 你可以通过调用一个预先定义好的接口 int guess(int num) 来获取猜测结果，
 * 返回值一共有 3 种可能的情况（-1，1 或 0）：
 * -1：我选出的数字比你猜的数字小 pick < num
 * 1：我选出的数字比你猜的数字大 pick > num
 * 0：我选出的数字和你猜的数字一样。恭喜！你猜对了！pick == num
 * 返回我选出的数字。
 * 
 * 示例 1：
 * 输入：n = 10, pick = 6
 * 输出：6
 * 
 * 示例 2：
 * 输入：n = 1, pick = 1
 * 输出：1
 */
public class Practice001_374 {

    // グローバル変数 global variable
    // private ArrayList<String> headListGlobal = new ArrayList<>();

    public Practice001_374() {
        System.out.println("Run Practice001_374. ");
    }

    public void runBefore(String[] param_1, String[] param_2) {
		System.out.println("Run Practice001_374.");
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
