package com.yangguangyuan.chapter3.section1.t3.s1;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月18日 上午7:55:58
 * @version: 1.0
 */
public class Test {

	public static void main(String[] args) {
		try {
			Object lock = new Object();
			MyThread1 myThread1 = new MyThread1(lock);
			myThread1.start();
			Thread.sleep(3000);
			
			MyThread2 myThread2 = new MyThread2(lock);
			myThread2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
