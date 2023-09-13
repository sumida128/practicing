import sp.easy.Practice001_06;
import sp.easy.Practice001_05;
import sp.easy.Practice001_18;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("To start practice. ");

        if (args.length == 0) {

            args = new String[]{"",""};
        }

        // https://leetcode.cn/studyplan/coding-interviews/

        /*
         * String
         * Offer 05.replace Space
         * 
         * Ex.1  
         * input : s = "We are happy."
         * output : "We%20are%20happy." 
         */
        Practice001_05 practice001_05 = new Practice001_05();
        practice001_05.try01(new String[]{"We are happy.","Practice001_05"});


        /*
         * Array
         * Offer 06.reverse Print
         * 
         * Ex.1
         * input : head = [1,3,2]
         * output : [2,3,1]
         */
        Practice001_06 practice001_06 = new Practice001_06();
        // practice001_06.try01(new String[]{"1","3","2"});
        practice001_06.try02(new String[]{"1","3","2"});
        // practice001_06.try03(new String[]{"1","3","2"});

        /*
         * Two Pointers
         * Offer 18.delete Node
         * 
         * Ex.1
         * input : head = [4,5,1,9], val = 5
         * output : [4,1,9]
         */
        Practice001_18 practice001_18 = 
            new Practice001_18(new int[]{4,5,1,9}, new String("5"));
        practice001_18.try01(new int[]{4,5,1,9}, new String("5"));


    }
}
