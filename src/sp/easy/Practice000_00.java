package sp.easy;

import java.util.ArrayList;

/*
 * 剑指 Offer 
 *  
 *  
 * 示例 1：
 * 输入: 
 * 输出:
 * 解释: 
 */
public class Practice000_00 {

    // グローバル変数 global variable
    private ArrayList<String> headListGlobal = new ArrayList<>();

    public Practice000_00(int[] head, String val) {
        System.out.println("Run Practice000_00.try01 ");

        System.out.println("実行前");
        System.out.print("▲head = ");
        for(int i = 0; i < head.length; i++) {

            System.out.print(head[i] + ",");
            headListGlobal.add( String.valueOf(head[i]));
        }
        System.out.print("  \u25B2");
        System.out.println("val = " + val);
    }

    public void runBefore(String[] param_1, String[] param_2) {

		System.out.println("Run Practice001_09.");

        System.out.println("実行前");
        System.out.print("▲ param_1 = ");
        for(int i = 0; i < param_1.length; i++) {

            System.out.print(param_1[i] + ",");
        }
        System.out.print("\r\n");

		System.out.print(" ▲ param_2 = ");
        for(int i = 0; i < param_2.length; i++) {

            System.out.print(param_2[i] + ",");
        }
        System.out.println("  \u25B2  ");
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
    }
    
}
