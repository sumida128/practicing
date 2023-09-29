package sp.easy;

// メモ sht + alt + o import成形

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
    // private ArrayList<String> headListGlobal = new ArrayList<>();

    public Practice001_29() {
        System.out.println("Run Practice001_29. ");

        // int[] head = {1,2};
        // String val = "";

        // System.out.println("実行前");
        // System.out.print("▲head = ");
        // for(int i = 0; i < head.length; i++) {

        //     System.out.print(head[i] + ",");
        //     headListGlobal.add( String.valueOf(head[i]));
        // }
        // System.out.print("  \u25B2");
        // System.out.println("val = " + val);
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
     * 失敗
     */
    public int[] spiralOrder_try01(int[][] matrix ) throws Exception {


        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return null;
        }

        // 範囲設定（面積）
        int row = matrix.length;
        int col = matrix[0].length;
        int[] result = new int[row * col];

        // 限界設定
        int left = 0;
        int right = col - 1;
        int top = 0;
        int bottom = row -1;
        System.out.println("left + right +  top + bottom");
        System.out.println(left + "," + right + "," + top + "," + bottom);

        /**
         * 
         * ------
         * |    |
         * |    |
         * |    |
         * ------
         */


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

    /**
     * 
     * @param matrix
     * @return
     * @throws Exception
     */
    public int[] spiralOrder_try02(int[][] matrix ) throws Exception {


        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return null;
        }

        // 範囲設定（面積）
        int row = matrix.length;
        int col = matrix[0].length;
        int[] result = new int[row * col];

        /**
         *         top = 0
         *         ------
         *         |    |
         *  left   |    |  right
         *         |    |
         *         ------
         *         bottom
         */
        // 限界設定
        int left = 0;
        int right = col - 1;
        int top = 0;
        int bottom = row - 1;

        // 返却配列のポインター
        int index = 0;

        while(true){

            //最初の一行目、方向は「→」
            for (int i = left; i<= right; i++) {

                result[index++] = matrix[top][i];
                System.out.print(matrix[top][i] + ",");
            }
            //範囲を収束（縮小）
            top++; // ++topを使えば、171行省略
            if (top > bottom) {
                break;
            }


            //方向を変える「↓」
            for(int i = top; i <= bottom; i++) {

                result[index++] = matrix[i][right];
                System.out.print(matrix[i][right] + ",");
            }
            //範囲を収束（縮小）
            if (--right < left) {
                break;
            }

            //方向を変える「←」
            for(int i = right ; i >= left ; i-- ) {

                result[index++] = matrix[bottom][i];
                System.out.print(matrix[bottom][i] + ",");
            }
            //範囲を収束（縮小）
            if (--bottom < top) {
                break;
            }

            //方向を変える「↑」
            for(int i = bottom; i >= top ; i-- ) {

                result[index++] = matrix[i][left];
                System.out.print(matrix[i][left] + ",");
            }
            //範囲を収束（縮小）
            if (++left < right) {
                break;
            }

        }

        return result;
    }
}
