package com.yangguangyuan.chapter1.section5;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月11日 下午5:03:46
 * @version: 1.0
 */
public class MyThread1 extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("run threadName="+this.currentThread().getName()+" begin");
			Thread.sleep(2000);
			System.out.println("run threadName="+this.currentThread().getName()+" end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
