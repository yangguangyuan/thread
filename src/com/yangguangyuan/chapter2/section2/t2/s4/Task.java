package com.yangguangyuan.chapter2.section2.t2.s4;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月15日 上午9:37:17
 * @version: 1.0
 */
public class Task {

	public void doLongTimeTas() {
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+"nosyn i="+(i+1));
		}
		
		System.out.println("");
		synchronized (this) {
			for(int i=0;i<100;i++) {
				System.out.println(Thread.currentThread().getName()+"syn i="+(i+1));
			}
		}
	}
}
