package com.yangguangyuan.chapter1.section4;
/**
 * @Description: (这里用一句话描述这个类的作用)
 * @author: yangguangyuan
 * @date: 2019年2月11日 下午3:41:09
 * @version: 1.0
 */
public class CountOperate extends Thread {

	public CountOperate() {
		System.out.println("CountOperate---begin");
		System.out.println("Thread.currentThread().getName(): "
				+ Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive(): "
				+ Thread.currentThread().isAlive());
		
		System.out.println("this.getName(): "+this.getName());
		System.out.println("this.isAlive(): "+this.isAlive());
		System.out.println("CountOperate---end");
	}
	
	@Override
	public void run() {
		System.out.println("run---begin");
		System.out.println("Thread.currentThread().getName(): "
				+ Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive(): "
				+ Thread.currentThread().isAlive());
		
		System.out.println("this.getName(): "+this.getName());
		System.out.println("this.isAlive(): "+this.isAlive());
		System.out.println("run---end");
	}
}
