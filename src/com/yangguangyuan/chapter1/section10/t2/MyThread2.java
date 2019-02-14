package com.yangguangyuan.chapter1.section10.t2;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 下午6:55:55
 * @version: 1.0
 */
public class MyThread2 extends Thread {
	@Override
	public void run() {
		super.run();
		for(int i=0;i<10;i++) {
			System.out.println("线程A:"+i);
		}
	}
}
