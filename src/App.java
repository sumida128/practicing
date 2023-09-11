import sp.Practice001_05;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("To start practice. ");

        if (args.length == 0) {

            args = new String[]{"",""};
        }

        /*
         * Offer 05.
         * 
         * Ex.1 
         * input : s = "We are happy."
         * output : "We%20are%20happy." 
         */
        Practice001_05 practice001_05 = new Practice001_05();
        practice001_05.try01(new String[]{"We are happy."});
    }
}
