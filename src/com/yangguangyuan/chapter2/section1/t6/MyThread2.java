package com.yangguangyuan.chapter2.section1.t6;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月13日 下午6:00:40
 * @version: 1.0
 */
public class MyThread2 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		Sub sub = new Sub();
		sub.subop();
	}
}
