package sp.easy;

/*
 * 剑指 Offer 18. 删除链表的节点
 *  用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 *  分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * 
 * 示例 1：
 * 输入：["CQueue","appendTail","deleteHead","deleteHead","deleteHead"]
 *       [[],[3],[],[],[]]
 * 输出：[null,null,3,-1,-1]
 */
public class Practice001_09 {

	    // グローバル変数 global variable

	public Practice001_09() {
	
	}

	public Practice001_09(String[] param_1, String[] param_2) {
	
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
    public void try01(String[] param_1, String[] param_2) throws Exception {
		runBefore(param_1,param_1);
        System.out.println("Run Practice001_09.try01");

		System.out.println("実行後");
        // for(int i = 0; i < headListGlobal.size(); i++) {

        //     if (headListGlobal.get(i).equals(val)) {

        //         headListGlobal.remove(i);
        //         i = i - 1;
        //     }
        // }

        // System.out.println("実行後");
        // for(int i = 0; i < headListGlobal.size(); i++) {

        //     System.out.print(headListGlobal.get(i) + ",");
        // }
        System.out.print("\r\n");
    }

	public void appendTail(int value) {

    }
    
    public int deleteHead() {
		return 0;
    }
}
