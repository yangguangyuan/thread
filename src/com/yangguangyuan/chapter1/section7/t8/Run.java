package com.yangguangyuan.chapter1.section7.t8;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 下午5:34:22
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
			e.printStackTrace();
		}
	}
}
