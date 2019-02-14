package com.yangguangyuan.chapter1.section10.t1;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 下午6:46:10
 * @version: 1.0
 */
public class Run {
	public static void main(String[] args) {
		System.out.println("main thread begin: "+Thread.currentThread()	.getPriority());
		Thread.currentThread().setPriority(6);
		System.out.println("main thread end: "+Thread.currentThread()	.getPriority());
		MyThread1 myThread1 = new MyThread1();
		myThread1.start();
	}
}
