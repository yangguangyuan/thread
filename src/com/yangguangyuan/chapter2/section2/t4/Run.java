package com.yangguangyuan.chapter2.section2.t4;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月15日 下午3:22:12
 * @version: 1.0
 */
public class Run {
	
	public static void main(String[] args) {
		MyThread[] array = new MyThread[100];
		for (int i=0;i<100;i++) {
			array[i] = new MyThread();
		}
		
		for(int i=0;i<100;i++) {
			array[i].start();
		}
	}
}
