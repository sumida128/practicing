import sp.easy.Practice001_06;
import sp.easy.Practice001_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

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

        /*
         * levelOrder
         * Offer 32. 
         * 
         * Ex.1
         * input : TreeNode root {[3,9,20,null,null,15,7]}
         * output : [[3],[9,20],[15,7]]
         */
        Practice001_32 practice001_32 =  new Practice001_32();
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("root3");
        DefaultMutableTreeNode rootNode9 = new DefaultMutableTreeNode("branch9");
        DefaultMutableTreeNode rootNode20 = new DefaultMutableTreeNode("branch20");
        DefaultMutableTreeNode rootNode15 = new DefaultMutableTreeNode("leaf15");
        DefaultMutableTreeNode rootNode7 = new DefaultMutableTreeNode("leaf7");
        DefaultMutableTreeNode rootNode8 = new DefaultMutableTreeNode("leaf8");
        rootNode.add(rootNode9);
        rootNode.add(rootNode20);

        rootNode20.add(rootNode15);
        rootNode20.add(rootNode7);
        rootNode20.add(rootNode8);

        // 
        DefaultTreeModel model = new DefaultTreeModel((TreeNode)rootNode, false);
        JTree jjj = new JTree(model);
        // System.out.println(rootNode.toString());
        // System.out.println(jjj.getModel().toString());
        List<List<String>> result32 = practice001_32.levelOrder_try01(
            rootNode);
        List<List<String>> ans32 = new ArrayList<List<String>>();
        System.out.println(result32.equals(ans32) ? "true" : "false");

        for (List<String> lstr: result32) {
            System.out.print( "[");
            for (String str : lstr) {
                System.out.print( str + ",");
            }
            System.out.println( "]");
        }

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
         * Offer 03.find Repeat Number
         * 
         * Ex.1  
         * input : [2, 3, 1, 0, 2, 5, 3]
         * output : 2 or 3  
         */
        // Practice001_03 practice001_03 = new Practice001_03();
        // practice001_03.findRepeatNumber_try01(new int[]{2, 3, 1, 0, 2, 5, 3, 2});


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
