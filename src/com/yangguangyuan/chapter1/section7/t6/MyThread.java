package com.yangguangyuan.chapter1.section7.t6;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 上午8:28:31
 * @version: 1.0
 */
public class MyThread extends Thread {
	@Override
	public void run() {
		try {
			super.run();
			this.stop();
		} catch (ThreadDeath e) {
			e.printStackTrace();
		}
	}
}
