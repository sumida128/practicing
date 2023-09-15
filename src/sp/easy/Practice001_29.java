package sp.easy;

import java.util.ArrayList;

/*
 * 剑指 Offer 29. 顺时针打印矩阵 spiralOrder
 *  输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 *  
 * 示例 1：
 * 输入: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出: [1,2,3,6,9,8,7,4,5]
示例 2：
 * 解释: 
 */
public class Practice001_29 {

    // グローバル変数 global variable
    private ArrayList<String> headListGlobal = new ArrayList<>();

    public Practice001_29() {
        System.out.println("Run Practice001_29. ");

        int[] head = {1,2};
        String val = "";

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

		System.out.println("Run Practice001_29.");

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
    public int[] spiralOrder_try01(int[][] matrix ) throws Exception {


        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return null;
        }

        int row = matrix.length;
        int col = matrix[0].length;
        int[] result = new int[row * col];
        int index = 0;

        int pointerX = 0;
        int pointerY = 0;
        int max = 0;

        while(true){

            for (pointerY = 0; pointerY < col ;pointerY++){

                result[index++] = matrix[pointerX][pointerY];
                System.out.println(matrix[pointerX][pointerY]);
                max++;
            }
            pointerY--;
            pointerX++;

            for(int x = pointerX ; x < row ;x++) {

                result[index++] = matrix[x][pointerY];
                System.out.println(matrix[x][pointerY]);
                pointerX++;
            }
            // pointerX--;

            for(int p = pointerY ;p >= 0 ; p-- ) {

                result[index++] = matrix[pointerX][p];
                System.out.println(matrix[pointerX][p]);
            }

            for(int p1 = pointerX ;p1 <= max ; p1-- ) {

                result[index++] = matrix[p1][pointerY];
            }
            break;

        }

        return result;
    }
    

    
    /*
     * ArrayList<String>.remove を利用する
     */
    public void spiralOrder_try02(int[] args, String val) throws Exception {

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
