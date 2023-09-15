import sp.easy.Practice001_06;
import sp.easy.Practice001_09;
import sp.easy.Practice001_03;
import sp.easy.Practice001_05;
import sp.easy.Practice001_18;
import sp.easy.Practice001_29;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("To start practice. ");

        if (args.length == 0) {

            args = new String[]{"",""};
        }

        // https://leetcode.cn/studyplan/coding-interviews/

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

                /*
         * Two Pointers
         * Offer 09.two 
         * 
         * Ex.1
         * input : ["CQueue","appendTail","deleteHead","deleteHead","deleteHead"]
         *         [[],[3],[],[],[]]
         * output : [null,null,3,-1,-1]
         */
        Practice001_29 practice001_29 =  new Practice001_29();
        int[] result = practice001_29.spiralOrder_try01(
            new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
            System.out.println(result);

    }
}
