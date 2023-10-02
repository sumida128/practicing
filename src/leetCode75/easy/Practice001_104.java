package leetCode75.easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * LeetCode 75 104. 二叉树的最大深度
 *  二叉树的 最大深度 是指从根节点到最远叶子节点的最长路径上的节点数。
 *  
 * 示例 1：
 * 输入: 给定二叉树: [3,9,20,null,null,15,7]
 *         3        1 depth
 *        / \
 *       9  20      2 depth
 *         /  \
 *        15   7    3 depth
 * 输出: 3 （最长路径上的节点数）
 */
public class Practice001_104 {

    // グローバル変数 global variable
    // private ArrayList<String> headListGlobal = new ArrayList<>();

    public Practice001_104() {
        System.out.println("Run Practice001_104. ");
    }

    public void runBefore(String[] param_1, String[] param_2) {
		System.out.println("Run Practice001_104.");
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
