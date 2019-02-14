package com.yangguangyuan.chapter1.section4;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月11日 下午3:26:38
 * @version: 1.0
 */
public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		System.out.println("begin: "+myThread.isAlive() );
		myThread.start();
		System.out.println("end: "+myThread.isAlive() );
	}
}
