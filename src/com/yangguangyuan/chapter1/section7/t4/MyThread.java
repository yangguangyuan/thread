package com.yangguangyuan.chapter1.section7.t4;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 上午8:05:20
 * @version: 1.0
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
