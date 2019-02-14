package com.yangguangyuan.chapter1.section8.t2;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 下午6:05:06
 * @version: 1.0
 */
public class Run2 {

	public static void main(String[] args) {
		try {
			MyThread myThread = new MyThread();
			myThread.start();
			myThread.sleep(2000);
			myThread.suspend();
			System.out.println("main end!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
