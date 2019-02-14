package com.yangguangyuan.chapter1.section3;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月11日 下午3:05:00
 * @version: 1.0
 * run方法是自动调用的方法
 */
public class Run2 {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
//		myThread.start();
		myThread.run();
	}
}
