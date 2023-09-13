package sp.easy;

import java.util.ArrayList;

/*
 * 剑指 Offer 18. 删除链表的节点
 *  给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *  返回删除后的链表的头节点。
 * 示例 1：
 * 输入: head = [4,5,1,9], val = 5
 * 输出: [4,1,9]
 * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 */
public class Practice001_18 {

    // グローバル変数 global variable
    private ArrayList<String> headListGlobal = new ArrayList<>();
    private String valGlobal = "";

    public Practice001_18(int[] head, String val) {
        System.out.println("Run Practice001_18.try01 ");

        System.out.println("実行前");
        System.out.print("▲ head = ");
        for(int i = 0; i < head.length; i++) {

            System.out.print(head[i] + ",");
            headListGlobal.add( String.valueOf(head[i]));
        }

        valGlobal = new String(val);
        System.out.print("  \u25B2 ");
        System.out.println("val = " + valGlobal);
    }

    /*
     * ArrayList<String>.remove を利用する
     */
    public void try01(int[] args, String val) throws Exception {

        for(int i = 0; i < headListGlobal.size(); i++) {

            if (headListGlobal.get(i).equals(val)) {

                headListGlobal.remove(i);
                i = i - 1;
            }
        }

        System.out.println("実行後");
        for(int i = 0; i < headListGlobal.size(); i++) {

            System.out.print(headListGlobal.get(i) + ",");
        }
        System.out.print("\r\n");
    }
    
}
