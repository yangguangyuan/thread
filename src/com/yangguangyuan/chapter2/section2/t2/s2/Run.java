package com.yangguangyuan.chapter2.section2.t2.s2;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月15日 上午8:20:21
 * @version: 1.0
 */
public class Run {
	
	public static void main(String[] args) {
		ObjectService objectService = new ObjectService();
		ThreadA threadA = new ThreadA(objectService);
		threadA.setName("A");
		threadA.start();
		
		ThreadB threadB = new ThreadB(objectService);
		threadB.setName("B");
		threadB.start();
	}
}
