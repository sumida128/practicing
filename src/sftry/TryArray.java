package sftry;

import java.util.ArrayList;


public class TryArray {
    
    private ArrayList<String> headListGlobal = new ArrayList<>();
        /*
     * ArrayList<String>.remove を利用する
     */
    public void try01(int[] args, String val) throws Exception {



        // String[] sss = new String[0];
        // // sss[0] = "0";
        // // sss[1] = "1";

        // String[] sss1 = new String[1];
        // sss1[0] = "0";
        // sss1[1] = "1";


        String s = ".6";
        String[] ss = s.split("\\.");
        int a = ss.length;

        String s1 = ".";
        String[] ss1 = s1.split("\\.");
        int a1 = ss1.length;

        if (null == ss1 ) {
            a1 = ss1.length + 99;
        }

        String s2 = "";
        String[] s21 = s2.split("\\.");
        int a2 = s21.length;

        int b = headListGlobal.size();

    }

        
}
