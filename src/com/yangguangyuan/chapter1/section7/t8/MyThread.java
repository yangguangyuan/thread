package com.yangguangyuan.chapter1.section7.t8;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 下午5:32:39
 * @version: 1.0
 */
public class MyThread extends Thread{

	@Override
	public void run() {
		while(true) {
			if(this.isInterrupted()) {
				System.out.println("线程停止了");
				return;
			}
			System.out.println(System.currentTimeMillis());
		}
	}
}
