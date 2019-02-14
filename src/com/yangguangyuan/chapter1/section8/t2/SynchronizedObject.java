package com.yangguangyuan.chapter1.section8.t2;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 下午5:45:53
 * @version: 1.0
 */
public class SynchronizedObject {

	synchronized public void printString() {
		System.out.println("begin");
		if(Thread.currentThread().getName().equals("a")) {
			System.out.println("线程独占suspend");
			Thread.currentThread().suspend();
		}
		System.out.println("end");
	}
}
