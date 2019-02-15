package com.yangguangyuan.chapter2.section2.t2.s4;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月15日 上午9:52:30
 * @version: 1.0
 */
public class Run {
	public static void main(String[] args) {
		Task task = new Task();
		Thread1 thread1 = new Thread1(task);
		thread1.setName("A");
		thread1.start();
		
		Thread2 thread2 = new Thread2(task);
		thread2.setName("B");
		thread2.start();
	}
}
