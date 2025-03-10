import sp.easy.Practice001_06;
import sp.easy.Practice001_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

import leetCode75.easy.Practice001_104;
import leetCode75.easy.Practice001_1173;
import leetCode75.easy.Practice001_136;
import leetCode75.easy.Practice001_338;
import leetCode75.easy.Practice001_374;
import leetCode75.easy.Practice001_700;
import leetCode75.easy.Practice001_746;
import sp.easy.Practice001_03;
import sp.easy.Practice001_05;
import sp.easy.Practice001_18;
import sp.easy.Practice001_29;
import sp.easy.Practice001_32;

/**
 * https://leetcode.cn/studyplan/coding-interviews/
 */
public class App {

    // // 処理前の時刻を取得
    // long startTime = System.nanoTime();
    // // 処理後の時刻を取得
    // long endTime = System.nanoTime();

    public static void timeCheck(String str, long startTime, long endTime) {

        System.out.println(str);
        System.out.println("開始時刻：" + startTime + " nano/s");
        System.out.println("終了時刻：" + endTime + " nano/s");
        System.out.println("処理時間：" + (endTime - startTime) + " nano/s");
    }

    public static void printer(int[] in) {

        System.out.print( "Result printer:[");
        for(int s : in) {
            
            System.out.print(s + " ,");
        }
        System.out.println( "]" );
    }

    public static void main(String[] args) throws Exception {
        System.out.println("To start practice. ");
        if (args.length == 0) {
            args = new String[]{"",""};
        }

        /**
         * DP - 1D Easy
         * LeetCode75 136. Single Number - 1D Easy
         * Given a non-empty array of integers nums,
         *  every element appears twice except for one. Find that single one.
         * You must implement a solution with a linear runtime complexity
         *  and use only constant extra space.
         * Example 1:
         * Input: nums = [2,2,1]
         * Output: 1
         * 
         * Example 2:
         * Input: nums = [4,1,2,1,2]
         * Output: 4
         * 
         * Example 3:
         * Input: nums = [1]
         * Output: 1
         */
        long startTime_136 = 0;
        Practice001_136 practice001_136 = new Practice001_136();
        startTime_136 = System.nanoTime();
        int[] result_lc75_163 = new int[]{practice001_136
            .singleNumber_try01(new int[]{2,2,3,1,5,1,5,3,4})};
        App.timeCheck("tribonacci_1173_try01 : ", startTime_136, System.nanoTime());
        App.printer(result_lc75_163);

        startTime_136 = System.nanoTime();
        int[] result_lc75_163_2 = new int[]{practice001_136
            .singleNumber_try01(new int[]{4,1,2,1,2})};
        App.timeCheck("result_lc75_1173_2 : ", startTime_136, System.nanoTime());
        App.printer(result_lc75_163_2);

        /**
         * DP - 1D Easy
         * LeetCode75 1137. N-th Tribonacci Number - 1D Easy
         * 
         * Example 1:
         * Input: n = 4
         * Output: 4
         * Explanation:
         *   T_3 = 0 + 1 + 1 = 2
         *   T_4 = 1 + 1 + 2 = 4
         * 
         * Example 2:
         * Input: n = 25
         * Output: 1389537
         */
        // long startTime_1173 = 0;
        // Practice001_1173 practice001_1173 = new Practice001_1173();
        // startTime_1173 = System.nanoTime();
        // int[] result_lc75_1173 = new int[]{practice001_1173
        //     .tribonacci_1173_try01(4)};
        // App.timeCheck("tribonacci_1173_try01 : ", startTime_1173, System.nanoTime());
        // App.printer(result_lc75_1173);

        // startTime_1173 = System.nanoTime();
        // int[] result_lc75_1173_2 = new int[]{practice001_1173
        //     .tribonacci_1173_try01(25)};
        // App.timeCheck("result_lc75_1173_2 : ", startTime_1173, System.nanoTime());
        // App.printer(result_lc75_1173_2);

        /**
         * DP - 1D Easy
         * LeetCode75 338.Bit Manipulation - 1D Easy
         * LeetCode75 338. Counting Bits
         * 
         * Example 1:
         * Input: n = 2
         * Output: [0,1,1]
         * Explanation: 0 --> 0
         *              1 --> 1
         *              2 --> 10
         * Example 2:
         * Input:  n = 5
         * Output: [0,1,1,2,1,2]
         * Explanation: 0 --> 0
         *              1 --> 1
         *              2 --> 10
         *              3 --> 11
         *              4 --> 100
         *              5 --> 101
         */
        // long startTime = 0;
        // Practice001_338 practice001_338 = new Practice001_338();
        // startTime = System.nanoTime();
        // int[] result_lc75_338 = practice001_338
        //     .countBits_338_try01(13);
        // App.timeCheck("result_lc75_338 : ", startTime, System.nanoTime());
        // App.printer(result_lc75_338);

        // startTime = System.nanoTime();
        // int[] result_lc75_338_2 = practice001_338
        //     .countBits_338_try02(14);
        // App.timeCheck("result_lc75_338_2 : ", startTime, System.nanoTime());
        // App.printer(result_lc75_338_2);

        /**
         * DP - 1D Easy
         * LeetCode75 746. Min Cost Climbing Stairs
         * You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
         * Once you pay the cost, you can either climb one or two steps.
         * You can either start from the step with index 0, or the step with index 1.
         * Return the minimum cost to reach the top of the floor.
         * 
         * Example 1:
         * Input: cost = [10,15,20]
         * Output: 15
         * Explanation: You will start at index 1.
         * - Pay 15 and climb two steps to reach the top.
         * The total cost is 15.
         * 
         * Example 2:
         * Input: cost = [1,100,1,1,1,100,1,1,100,1]
         * Output: 6
         * Explanation: You will start at index 0.
         * - Pay 1 and climb two steps to reach index 2.
         * - Pay 1 and climb two steps to reach index 4.
         * - Pay 1 and climb two steps to reach index 6.
         * - Pay 1 and climb one step to reach index 7.
         * - Pay 1 and climb two steps to reach index 9.
         * - Pay 1 and climb one step to reach the top.
         * The total cost is 6.
         */
        // Practice001_746 practice001_746 = new Practice001_746();
        // int result_lc75_746 = practice001_746
        //     .minCostClimbingStairs_746_try02(new int[]{10,15,20});
        // System.out.println("result_lc75_746 : " + result_lc75_746);
        // int result_lc75_746_2 = practice001_746
        //     // .minCostClimbingStairs_746_try01(new int[]{1,100,1,1,1,100,1,1,100,1});
        //     .minCostClimbingStairs_746_try02(new int[]{1,100,1,1,1,100,1,1,100,1});
        // System.out.println("result_lc75_746_2 : " + result_lc75_746_2);

        // TODO
        /**
         * DP - 1D Easy
         * LeetCode75 1137. N-th Tribonacci Number

         * The Tribonacci sequence Tn is defined as follows:
         * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
         * Given n, return the value of Tn.
         *  ※sequence ＝順序
         *    defined  ＝定義済み
         *    Tribonacci＝トリボナッチ
         * Example 1:
         * Input: n = 4
         * Output: 4
         * Explanation:
         * T_3 = 0 + 1 + 1 = 2
         * T_4 = 1 + 1 + 2 = 4
         * 
         * Example 2:
         * Input: n = 25
         * Output: 1389537
         */
        // Practice001_1173 practice001_1173 = new Practice001_1173();
        // int result_lc75_1173 = practice001_1173.tribonacci_1173_try01(4);
        // System.out.println("result_lc75_1173 : " + result_lc75_1173);

        /**
         * Binary Search
         * LeetCode75 374. Guess Number Higher or Lower
         * We are playing the Guess Game. The game is as follows:
         * I pick a number from 1 to n. You have to guess which number I picked.
         * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
         * You call a pre-defined API int guess(int num), which returns three possible results:
         * 
         * Example 1:
         * Input: n = 10, pick = 6
         * Output: 6
         * 
         * Example 2:
         * Input: n = 1, pick = 1
         * Output: 1
        //  */
        // Practice001_374 practice001_374 = new Practice001_374();
        // int result_lc75_374 = practice001_374.guessNumber_374_try01(10, 6);
        // System.out.println("result_lc75_374" + result_lc75_374);


        /**
         * Binary Tree-DFS
         * LeetCode75 700. Search in a Binary Search Tree 
         * You are given the root of a binary search tree (BST) and an integer val.
         * Find the node in the BST that the node's value equals val and
         * return the subtree rooted with that node. If such a node does not exist, return null.
         * 
         * Ex.1  
         * input :  root = [4,2,7,1,3], val = 2
         * output : [2,1,3]
         * 
         * Ex.2
         * input : root = [4,2,7,1,3], val = 5
         * output : []
         */ 
        // Practice001_700 practice001_700 = new Practice001_700();
        // DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("root4");
        // DefaultMutableTreeNode branchNode2 = new DefaultMutableTreeNode("branch2");
        // DefaultMutableTreeNode branchNode7 = new DefaultMutableTreeNode("branch7");
        // //TODO
        // DefaultMutableTreeNode leafNode1 = new DefaultMutableTreeNode("leaf1");
        // DefaultMutableTreeNode leafNode3 = new DefaultMutableTreeNode("leaf3");
        // DefaultMutableTreeNode leafNode5 = new DefaultMutableTreeNode("leaf5");
        // DefaultMutableTreeNode leafNode6 = new DefaultMutableTreeNode("leaf6");
        // // branch
        // rootNode.add(branchNode2);
        // rootNode.add(branchNode7);

        // // leaf
        // branchNode2.add(leafNode1);
        // branchNode2.add(leafNode3);
        // // leafNode3.add(leafNode5);
        // // leafNode3.add(leafNode6);

        // TreeNode result_lc75_700_1 = practice001_700.searchBST_700_try01(
        //     rootNode, 2);
        // // 結果確認
        // System.out.println(null != result_lc75_700_1 ? "true: " + result_lc75_700_1 : "false");

        /**
         * Binary Tree-DFS
         * LeetCode75 104. Maximum Depth of Binary Tree. 
         * Given the root of a binary tree, return its maximum depth.
         * A binary tree's maximum depth is the number of nodes along the longest path from the
         * root node down to the farthest leaf node.
         * 
         * Ex.1  
         * input : [2, 3, 1, 0, 2, 5, 3]
         * output : 3
         * 
         * Ex.2
         * input : [1,null,2]
         * output : 2
         */
        // Practice001_104 Practice001_104 = new Practice001_104();
        // DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("root3");
        // DefaultMutableTreeNode rootNode9 = new DefaultMutableTreeNode("branch9");
        // DefaultMutableTreeNode rootNode20 = new DefaultMutableTreeNode("branch2");
        // DefaultMutableTreeNode rootNode15 = new DefaultMutableTreeNode("leaf1");
        // DefaultMutableTreeNode rootNode7 = new DefaultMutableTreeNode("leaf7");
        // DefaultMutableTreeNode rootNode8 = new DefaultMutableTreeNode("leaf8");
        // DefaultMutableTreeNode rootNode8_1 = new DefaultMutableTreeNode("leaf8_1");

        // rootNode.add(rootNode9);
        // rootNode.add(rootNode20);

        // rootNode20.add(rootNode15);
        // rootNode20.add(rootNode7);
        // rootNode7.add(rootNode8);
        // rootNode7.add(rootNode8_1);
        // List<List<String>> result_lc75_104 = Practice001_104.maxDepth_104_try01(rootNode);
        // int result_lc75_104_2 = Practice001_104.maxDepth_104_try02(rootNode);
        // 結果確認
        // System.out.println(result_lc75_104_2 != 0 ? "true: " + result_lc75_104_2 : "false");

        // TODO 後回し
        // DefaultTreeModel model = new DefaultTreeModel((TreeNode)rootNode, false);
        // JTree jjj = new JTree(model);
        // // System.out.println(rootNode.toString());
        // // System.out.println(jjj.getModel().toString());
        // List<List<String>> result32 = practice001_32.levelOrder_try01(
        //     rootNode);
        // List<List<String>> ans32 = new ArrayList<List<String>>();
        // System.out.println(result32.equals(ans32) ? "true" : "false");

        // for (List<String> lstr: result32) {
        //     System.out.print( "[");
        //     for (String str : lstr) {
        //         System.out.print( str + ",");
        //     }
        //     System.out.println( "]");
        // }
        // TODO

        /**
         * String
         * Offer 03.find Repeat Number
         * 
         * Ex.1  
         * input : [2, 3, 1, 0, 2, 5, 3]
         * output : 2 or 3  
         */
        // Practice001_03 practice001_03 = new Practice001_03();
        // practice001_03.findRepeatNumber_try01(new int[]{2, 3, 1, 0, 2, 5, 3, 2});
        // practice001_03.findRepeatNumber_try02(new int[]{2, 3, 1, 0, 2, 5, 3, 2});
        // practice001_03.findRepeatNumber_try02(new int[]{2, 3, 5, 1, 0, 5, 4});
        // TODO 配列のプリンターのメモがあります
        // practice001_03.findRepeatNumber_try03(new int[]{2, 3, 1, 0, 2, 5, 3, 2});


        /*
         * levelOrder
         * Offer 32. 
         * 
         * Ex.1
         * input : TreeNode root {[3,9,20,null,null,15,7]}
         * output : [[3],[9,20],[15,7]]
         */
        // Practice001_32 practice001_32 =  new Practice001_32();
        // DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("root3");
        // DefaultMutableTreeNode rootNode9 = new DefaultMutableTreeNode("branch9");
        // DefaultMutableTreeNode rootNode20 = new DefaultMutableTreeNode("branch20");
        // DefaultMutableTreeNode rootNode15 = new DefaultMutableTreeNode("leaf15");
        // DefaultMutableTreeNode rootNode7 = new DefaultMutableTreeNode("leaf7");
        // DefaultMutableTreeNode rootNode8 = new DefaultMutableTreeNode("leaf8");
        // rootNode.add(rootNode9);
        // rootNode.add(rootNode20);

        // rootNode20.add(rootNode15);
        // rootNode20.add(rootNode7);
        // rootNode20.add(rootNode8);

        // // 
        // DefaultTreeModel model = new DefaultTreeModel((TreeNode)rootNode, false);
        // JTree jjj = new JTree(model);
        // // System.out.println(rootNode.toString());
        // // System.out.println(jjj.getModel().toString());
        // List<List<String>> result32 = practice001_32.levelOrder_try01(
        //     rootNode);
        // List<List<String>> ans32 = new ArrayList<List<String>>();
        // System.out.println(result32.equals(ans32) ? "true" : "false");

        // for (List<String> lstr: result32) {
        //     System.out.print( "[");
        //     for (String str : lstr) {
        //         System.out.print( str + ",");
        //     }
        //     System.out.println( "]");
        // }

        /*
         * matrix_2 spiralOrder
         * Offer 29. 
         * 
         * Ex.1
         * input : new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
         * output : [1, 2, 3, 6, 9, 8, 7, 4, 5]
         */
        // Practice001_29 practice001_29 =  new Practice001_29();
        // int[] result = practice001_29.spiralOrder_try02(
        //     new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        // int[] ans = new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5};
        // System.out.println(Arrays.equals(result, ans) ? "true" : "false");

        /**
         * input : new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9},{10, 11, 12}}
         * output : [1, 2, 3, 6, 9, 8, 7, 4, 5]
         */
        // result = practice001_29.spiralOrder_try02(
        //     new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9},{10, 11, 12}});
        // ans = new int[]{1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8};
        // System.out.println(Arrays.equals(result, ans) ? "true" : "false");


        /*
         * String
         * Offer 05.replace Space
         * 
         * Ex.1  
         * input : s = "We are happy."
         * output : "We%20are%20happy." 
         */
        // Practice001_05 practice001_05 = new Practice001_05();
        // practice001_05.try01(new String[]{"We are happy.","Practice001_05"});


        /*
         * Array
         * Offer 06.reverse Print
         * 
         * Ex.1
         * input : head = [1,3,2]
         * output : [2,3,1]
         */
        // Practice001_06 practice001_06 = new Practice001_06();
        // practice001_06.try01(new String[]{"1","3","2"});
        // practice001_06.try02(new String[]{"1","3","2"});
        // practice001_06.try03(new String[]{"1","3","2"});

        /*
         * Two Pointers
         * Offer 18.delete Node
         * 
         * Ex.1
         * input : head = [4,5,1,9], val = 5
         * output : [4,1,9]
         */
        // Practice001_18 practice001_18 = 
        //     new Practice001_18(new int[]{4,5,1,9}, new String("5"));
        // practice001_18.try01(new int[]{4,5,1,9}, new String("5"));

        /*
         * Two Pointers
         * Offer 09.two 
         * 
         * Ex.1
         * input : ["CQueue","appendTail","deleteHead","deleteHead","deleteHead"]
         *         [[],[3],[],[],[]]
         * output : [null,null,3,-1,-1]
         */
        // Practice001_09 practice001_09 =  new Practice001_09( );
        // practice001_09.try01(
        //     new String[]{"CQueue","appendTail","deleteHead","deleteHead","deleteHead"},
        //     new String[]{null,"3",null,null,null});


    }
}
