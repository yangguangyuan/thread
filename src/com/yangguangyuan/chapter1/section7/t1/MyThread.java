package com.yangguangyuan.chapter1.section7.t1;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月11日 下午5:24:21
 * @version: 1.0
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		for(int i=0;i<500000;i++) {
			System.out.println("i="+(i+1));
		}
	}
}
