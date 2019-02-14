package com.yangguangyuan.chapter1.section3;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月11日 下午3:13:42
 * @version: 1.0
 */
public class CountOperate extends Thread {

	public CountOperate() {
		System.out.println("CountOperate---begin");
		System.out.println("Thread.currentThread().getName(): "+Thread.currentThread().getName());
		System.out.println("this.getName(): "+this.getName());
		System.out.println("CountOperate---end");
	}
	
	public void run() {
		System.out.println("run---begin");
		System.out.println("Thread.currentThread().getName(): "+Thread.currentThread().getName());
		System.out.println("this.getName(): "+this.getName());
		System.out.println("run---end");
	}
}
