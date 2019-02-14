package com.yangguangyuan.chapter1.section1;
/**
 * @Description: (这里用一句话描述这个类的作用)
 * @author: yangguangyuan
 * @date: 2019年2月2日 下午4:46:14
 * @version: 1.0
 */
public class MyThread extends Thread {

	private int count = 5;

	@Override
	synchronized public void run() {
		super.run();
		count--;
		System.out.println("由 " + this.currentThread().getName()
				+ " 计算,count=" + count);
	}
	
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		
		Thread myThread1 = new Thread(thread,"A");
		Thread myThread2 = new Thread(thread,"B");
		Thread myThread3 = new Thread(thread,"C");
		Thread myThread4 = new Thread(thread,"D");
		Thread myThread5 = new Thread(thread,"E");
		
		myThread1.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();
		myThread5.start();
	}
}
