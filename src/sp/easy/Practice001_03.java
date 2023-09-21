package sp.easy;

import java.util.ArrayList;
import java.util.Arrays;
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

    // コンストラクタ
    public Practice001_03() {
        System.out.println("Run Practice001_03. ");

    }

    /**
     * 事前処理、パラメータをプリント
     * 
     * @param param_1 int[]
     * @param param_2 String メソッド名
     */
    public void runBefore(int[] param_1, String param_2) {

		System.out.println("Run Practice001_03." + param_2);

        System.out.println("実行前");
        System.out.print("▲ param_1 = ");
        for(int i = 0; i < param_1.length; i++) {

            System.out.print(param_1[i] + ",");
        }
        System.out.print("\r\n");

		System.out.print("▲ param_2 = " + param_2 + ",");
        System.out.println("  \u25B2  ");
	}

    /*
     * ArrayList<String>.remove を利用する
     * デメリット：二つループを使った
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
    }

    /*
     * 交換と順番を利用する
     * 
     */
    public void findRepeatNumber_try02(int[] args) throws Exception {
        runBefore(args, "findRepeatNumber_try02");

        int resoult = -1;
        int i = 0;
        while(i < args.length) {
            
            // 解法有一个关键点是只有 nums[i] == i 的时候i才递增，
            // 这样保证找到相同元素前不会漏掉某些元素的处理
            //値の「0」は配列コンテナ[0]に置かないといけません。
            //値の「1」は配列コンテナ[1]に置かないといけません。
            if(args[i] == i) {
                i++;
                continue;
            }

            int temp = args[i];
            int target = args[temp];

            // 同じアイテムがあれば
            if(temp == target) {

                // その値を返却
                resoult = target; 
                // 重複値を探した
                break;
            } else {

                //値の数字と配列コンテナの位置順番は同じまで
                //値を交換して次のチェックを行う
                args[temp] = temp;
                args[i] = target;
            }

        }

        //先会ったの重複値を返す
        System.out.println("実行後：" + "重複値＝回数" );
        System.out.println(resoult);
    }

    /*
     * 順番にして重複値を探す
     */
    public void findRepeatNumber_try03(int[] args) throws Exception {
        runBefore(args, "findRepeatNumber_try03");

        //順番にする
        Arrays.sort(args);
 
        Integer[] resoult = new Integer[args.length];
        int index = 0;
        
        String[] resoultS = new String[]{"A","B"};
 
        //順番にしてから重複値がある場合、連続している
        //順番「1」から
        for (int i = 1; i < args.length; i++) {

            //配列[0]と[1]一個前の値比較...
            if (args[i] == args[i - 1]){

                //重複値を探したら追加
                resoult[index++] = args[i];
             }
        }

        System.out.println("実行後：" + "重複値＝回数" );
        // 配列から ArrayListに変換
        ArrayList<Integer> arrayListInt = new ArrayList<Integer>(Arrays.asList(resoult));
        // 配列から ArrayListに変換
        ArrayList<String> arrayListStr = new ArrayList<String>(Arrays.asList(resoultS));
        
        // 配列プリントできない 1[Ljava.lang.Integer;@548c4f57
        System.out.println("1" + resoult);
        // ArrayListプリントできる
        System.out.println("2" + arrayListInt);
        // ArrayListプリントできる
        System.out.println("3" + arrayListStr);
        // 配列プリントしたい場合
        System.out.println("4" + Arrays.toString(resoult));
    }
}
