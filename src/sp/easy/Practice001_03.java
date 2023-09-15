package sp.easy;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * 剑指 Offer 03. 找出数组中重复的数字 findRepeatNumber
 *  在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 *  数组中某些数字是重复的，但不知道有几个数字重复了，
 *  也不知道每个数字重复了几次。
 *  请找出数组中任意一个重复的数字。
 *  
 * 示例 1：
 * 输入: [2, 3, 1, 0, 2, 5, 3]
 * 输出: 2 或 3 
示例 2：
 * 解释: 
 */
public class Practice001_03 {

    // グローバル変数 global variable
    private ArrayList<String> headListGlobal = new ArrayList<>();

    public Practice001_03() {
        System.out.println("Run Practice001_03. ");

    }

    public void runBefore(int[] param_1, String param_2) {

		System.out.println("Run Practice001_03." + param_2);

        System.out.println("実行前");
        System.out.print("▲ param_1 = ");
        for(int i = 0; i < param_1.length; i++) {

            System.out.print(param_1[i] + ",");
        }
        System.out.print("\r\n");

		System.out.print("▲ param_2 = ");
        // for(int i = 0; i < param_2.length; i++) {

            System.out.print(param_2 + ",");
        // }
        System.out.println("  \u25B2  ");
	}

    /*
     * ArrayList<String>.remove を利用する
     */
    public void findRepeatNumber_try01(int[] args) throws Exception {
        runBefore(args, "findRepeatNumber_try01");

        HashMap<Integer,Integer> findedInt = new HashMap<>();
        for(int i = 0; i < args.length; i++) {

            int findInt = args[i];

            int k = 0;
            for(int j = 0; j < args.length; j++) {

                // 同じ値ちょこちょこチェック
                if(findInt == args[j]) {

                    // 一回目を飛ばす
                    if(k == 0){
                        k++;
                        continue;
                    }
                    findedInt.put(findInt, k + 1);
                    k++;
                }
            }
            k = 0;
        }

        
        System.out.println("実行後：" + "重複値＝回数" );
        System.out.println(findedInt);


        // System.out.println("実行後");
        // for(int i = 0; i < headListGlobal.size(); i++) {

        //     System.out.print(headListGlobal.get(i) + ",");
        // }
    }
    
}
