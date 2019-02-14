package com.yangguangyuan.chapter1.section5;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月11日 下午5:06:49
 * @version: 1.0
 */
public class Run1 {
	
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		System.out.println("begin = "+System.currentTimeMillis());
		myThread1.start();
		System.out.println("end = "+System.currentTimeMillis());
	}
}
