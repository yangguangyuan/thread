package com.yangguangyuan.chapter3.section1.t3.s2;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月18日 上午8:07:58
 * @version: 1.0
 */
public class Run {
	public static void main(String[] args) {
		try {
			Object lock = new Object();
			ThreadA threadA = new ThreadA(lock);
			threadA.start();

			Thread.sleep(1000);
			ThreadB threadB = new ThreadB(lock);
			threadB.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
