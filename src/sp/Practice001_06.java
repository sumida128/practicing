package sp;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 剑指 Offer 06. 从尾到头打印链表
 *  输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 示例 1：
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */
public class Practice001_06 {

    /*
     * ArrayList.set を利用する
     */
    public void try01(String[] head) throws Exception {
        System.out.println("Run Practice001_06.try01 ");

        System.out.println("実行前");
        ArrayList<String> headList = new ArrayList<>();
        for(int i = 0; i < head.length; i++) {

            System.out.print(head[i] + ",");
            headList.add(head[i]);
        }
        System.out.print("\r\n");

        String a = headList.get(0);
        String b = headList.get(headList.size()-1);

        headList.set(0, b);
        headList.set(headList.size()-1, a);

        System.out.println("実行後");
        for(int i = 0; i < headList.size(); i++) {

            System.out.print(headList.get(i) + ",");
        }
    }

    /*
     * Collections.reverse を利用する
     */
    public void try02(String[] head) throws Exception {
        System.out.println("Run Practice001_06.try02 ");

        ArrayList<String> headList = new ArrayList<>();
        for(int i = 0; i < head.length; i++) {

            System.out.println(head[i]);
            headList.add(head[i]);
        }

        Collections.reverse(headList);
        System.out.println("・ 実行後");
        System.out.println(headList);
    }

    /*
     * 暴力ループを使う
     */
    public void try03(String[] head) throws Exception {
        System.out.println("Run Practice001_06.try03 ");

        System.out.println("実行前");
        ArrayList<String> headList = new ArrayList<>();
        for(int i = 0; i < head.length; i++) {

            System.out.print(head[i] + ",");
            headList.add(head[i]);
        }
        System.out.print("\r\n");

        String a = headList.get(0);
        String b = headList.get(headList.size()-1);

        // headList.remove(0);
        // headList.add(a);

        // headList.remove(headList.size()-1);
        // headList.add(b);

        System.out.println("実行後");
        ArrayList<String> headListAft = new ArrayList<>();
        for(int i = 0; i < headList.size(); i++) {

            if(i == 0) {

                headListAft.add(b);

            } else if(i == (headList.size() - 1))  {

                headListAft.add(a);

            } else {

                headListAft.add(headList.get(i));
            }

            System.out.print(headListAft.get(i) + ",");
        }
    }

}
