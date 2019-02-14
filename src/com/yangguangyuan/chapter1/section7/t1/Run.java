package com.yangguangyuan.chapter1.section7.t1;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月11日 下午5:25:53
 * @version: 1.0
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyThread myThread = new MyThread();
			myThread.start();
			Thread.sleep(2000);
			myThread.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
