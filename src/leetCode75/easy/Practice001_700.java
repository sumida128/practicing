package leetCode75.easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

/*
 * LeetCode 75 104. 二叉树的最大深度
 * 给定二叉搜索树（BST）的根节点 root 和一个整数值 val。
 * 你需要在 BST 中找到节点值等于 val 的节点。
 * 返回以该节点为根的子树。 如果节点不存在，则返回 null 。。
 *  
 * 示例 1：
 * 输入: 给定二叉树: [4,2,7,1,3] [2]
 *         4        1 depth
 *        / \
 *       2   7      2 depth
 *      / \
 *     1   3        3 depth
 * 输出: [2, 1, 3] （最长路径上的节点数）
 */
public class Practice001_700 {

    // グローバル変数 global variable
    // private ArrayList<String> headListGlobal = new ArrayList<>();

    public Practice001_700() {
        System.out.println("Run Practice001_700. ");
    }

    public void runBefore(String[] param_1, String[] param_2) {
		System.out.println("Run Practice001_700.");
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

    /*
     * 修正していない
     */
    public List<List<String>> maxDepth_104_try01(TreeNode root) throws Exception {

        //初期化
        Deque<TreeNode> dequeTreeNode = new ArrayDeque<>();
        List<List<String>> result = new ArrayList<List<String>>();

        if (null != root) {
            dequeTreeNode.addLast(root);
        } else {
            String str = "emtry";
            List<String> resultList = new ArrayList<String>(Arrays.asList(str));
            // result = new ArrayList<List<String>>(Arrays.asList(resultList));
            result.add(resultList);
            return result;
        }

        // TreeNodeコンテンツで該当層があれば
        while (!dequeTreeNode.isEmpty()) {
            //該当層の数
            int dequeTnSize = dequeTreeNode.size();

            //該当層の内容を保存するリスト
            List<String> list = new ArrayList<>();
            //該当層の子供層があれば、一時的な保存
            Deque<TreeNode> dequeTnTemp = new ArrayDeque<>();
            //該当層の数をループ
            while (dequeTnSize-- > 0) {
                // 該当層のコンテナは後ろから取ってから削除する
                TreeNode tLast = dequeTreeNode.pollLast();

                //該当層に取った内容をリストに保存する
                list.add(tLast.toString());

                //子供層を確認（最後層かどうか）
                if(!tLast.isLeaf()) {
                    //子供層の数
                    int count = tLast.getChildCount();
                    for (int i = 0; i < count; i++){
                        //子供層の内容を一時的な保存
                        dequeTnTemp.addLast(tLast.getChildAt(i));
                    }
                }
            }

            //子供層があれば、次から子供層をループする
            for (TreeNode tt : dequeTnTemp) {
                dequeTreeNode.addLast(tt);
            }
            //該当層の内容を追加
            result.add(list);
        }

        return result;
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
