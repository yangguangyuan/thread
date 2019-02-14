package com.yangguangyuan.chapter1.section3;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月11日 下午3:02:43
 * @version: 1.0
 */
public class MyThread extends Thread {
	
	public MyThread() {
		System.out.println("构造方法打印: "+Thread.currentThread().getName());
	}
	
	public void run() {
		System.out.println("run方法打印: "+Thread.currentThread().getName());
	}
}
