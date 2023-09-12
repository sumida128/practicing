import sp.Practice001_06;
import sp.easy.Practice001_05;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("To start practice. ");

        if (args.length == 0) {

            args = new String[]{"",""};
        }

        // https://leetcode.cn/studyplan/coding-interviews/

        /*
         * Offer 05.
         * 
         * Ex.1  
         * input : s = "We are happy."
         * output : "We%20are%20happy." 
         */
        Practice001_05 practice001_05 = new Practice001_05();
        practice001_05.try01(new String[]{"We are happy.","Practice001_05"});


        /*
         * Offer 06.
         * 
         * Ex.1
         * input : head = [1,3,2]
         * output : [2,3,1]
         */
        // Practice001_06 practice001_06 = new Practice001_06();
        // practice001_06.try01(new String[]{"1","3","2"});
        // practice001_06.try02(new String[]{"1","3","2"});
        // practice001_06.try03(new String[]{"1","3","2"});

    }
}
