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
import leetCode75.easy.Practice001_700;
import sp.easy.Practice001_03;
import sp.easy.Practice001_05;
import sp.easy.Practice001_18;
import sp.easy.Practice001_29;
import sp.easy.Practice001_32;

/**
 * https://leetcode.cn/studyplan/coding-interviews/
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("To start practice. ");

        if (args.length == 0) {
            args = new String[]{"",""};
        }


        /**
         * Binary Tree-DFS
         * Leet Code 700. Search in a Binary Search Tree 
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
        
        Practice001_700 practice001_700 = new Practice001_700();
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("root4");
        DefaultMutableTreeNode branchNode2 = new DefaultMutableTreeNode("branch2");
        DefaultMutableTreeNode branchNode7 = new DefaultMutableTreeNode("branch7");
        //TODO
        DefaultMutableTreeNode leafNode1 = new DefaultMutableTreeNode("leaf1");
        DefaultMutableTreeNode leafNode3 = new DefaultMutableTreeNode("leaf3");
        // DefaultMutableTreeNode rootNode8 = new DefaultMutableTreeNode("leaf8");
        // DefaultMutableTreeNode rootNode8_1 = new DefaultMutableTreeNode("leaf8_1");

        rootNode.add(branchNode2);
        rootNode.add(branchNode7);

        branchNode2.add(leafNode1);
        branchNode2.add(leafNode3);
        // rootNode7.add(rootNode8);
        // rootNode7.add(rootNode8_1);
        // List<List<String>> result_lc75_104 = Practice001_104.maxDepth_104_try01(rootNode);
        TreeNode result_lc75_700_1 = practice001_700.searchBST_700_try01(rootNode, 5);
        // 結果確認
        System.out.println(null != result_lc75_700_1 ? "true: " + result_lc75_700_1 : "false");



        /**
         * Binary Tree-DFS
         * Leet Code 104. Maximum Depth of Binary Tree. 
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
