package com.yangguangyuan.chapter1.section10.t2;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 下午6:57:44
 * @version: 1.0
 */
public class Run {

	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		myThread1.setPriority(1);
		myThread1.start();
		MyThread2 myThread2 = new MyThread2();
		myThread2.setPriority(10);
		myThread2.start();
	}
}
