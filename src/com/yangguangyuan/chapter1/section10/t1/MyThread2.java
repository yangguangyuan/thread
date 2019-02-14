package com.yangguangyuan.chapter1.section10.t1;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 下午6:45:06
 * @version: 1.0
 */
public class MyThread2 extends Thread {

	@Override
	public void run() {
		super.run();
		System.out.println("MyThread2 run priority="+this.getPriority());
	}
}
