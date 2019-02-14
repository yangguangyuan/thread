package com.yangguangyuan.chapter1.section7.t5;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 上午8:18:28
 * @version: 1.0
 */
public class Run {
	
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(2000);
			thread.stop();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
