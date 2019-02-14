package com.yangguangyuan.chapter1.section7.t5;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 上午8:16:25
 * @version: 1.0
 */
public class MyThread extends Thread {
	private int i= 0;
	
	@Override
	public void run() {
		try {
			while(true) {
				i++;
				System.out.println("i="+i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
