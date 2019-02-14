package com.yangguangyuan.chapter1.section4;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月11日 下午3:25:44
 * @version: 1.0
 */
public class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("run="+this.isAlive());
	}
}
