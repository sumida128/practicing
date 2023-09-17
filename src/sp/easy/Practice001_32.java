package sp.easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * 剑指 Offer 32 - II. 从上到下打印二叉树 II Solution
 *  从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 *  
 * 示例 1：
 * 输入: 给定二叉树: [3,9,20,null,null,15,7]
 *         3
 *        / \
 *       9  20
 *         /  \
 *        15   7
 * 输出: 返回其层次遍历结果：
 *       [
 *        [3],
 *        [9,20],
 *        [15,7]
 *       ]
 */
public class Practice001_32 {

    // グローバル変数 global variable
    private ArrayList<String> headListGlobal = new ArrayList<>();

    public Practice001_32() {
        System.out.println("Run Practice001_29. ");
    }

    public void runBefore(String[] param_1, String[] param_2) {
		System.out.println("Run Practice001_32.");
	}

    /*
     * 
     */
    public List<List<String>> levelOrder_try01(TreeNode root) throws Exception {

        //初期化
        Deque<TreeNode> dequeTreeNode = new ArrayDeque<>();
        List<List<String>> result = new ArrayList<List<String>>();
        if (null != root) {
            dequeTreeNode.addLast(root);
        } else {
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
     * 
     * @param matrix
     * @return
     * @throws Exception
     */
    public int[] levelOrder_try02(int[][] matrix ) throws Exception {

        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return null;
        }

        // 範囲設定（面積）
        int row = matrix.length;
        int col = matrix[0].length;
        int[] result = new int[row * col];

        return result;
    }
}
