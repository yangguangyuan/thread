package com.yangguangyuan.chapter2.section2.t2.s12;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月15日 上午11:19:54
 * @version: 1.0
 */
public class Run {
	public static void main(String[] args) {
		try {
			DealThread t1 = new DealThread();
			t1.setFlag("a");
			Thread thread1 = new Thread(t1);
			thread1.start();
			
			Thread.sleep(100);
			t1.setFlag("b");
			Thread thread2 = new Thread(t1);
			thread2.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
