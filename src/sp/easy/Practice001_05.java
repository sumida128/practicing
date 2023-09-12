package sp.easy;

import java.util.ArrayList;

/*
 * 剑指 Offer 05. 替换空格
 *  请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 示例 1：
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 */
public class Practice001_05 {

    /*
     * String.replaceAll を利用する
     */
    public void try01(String[] args) throws Exception {
        System.out.println("Run Practice001_05.try01 ");

        System.out.println("実行前");
        ArrayList<String> argsList = new ArrayList<>();
        for(int i = 0; i < args.length; i++) {

            System.out.print(args[i] + ",");
            argsList.add(args[i]);
        }
        System.out.print("\r\n");

        // TODO
        
    }
}