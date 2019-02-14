package com.yangguangyuan.chapter1.section8.t1;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 下午5:38:56
 * @version: 1.0
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyThread myThread = new MyThread();
			myThread.start();
			Thread.sleep(2000);
			
			myThread.suspend();
			System.out.println("A= "+System.currentTimeMillis()+"i= "+myThread.getI());
			Thread.sleep(2000);
			System.out.println("A= "+System.currentTimeMillis()+"i= "+myThread.getI());
			
			
			myThread.resume();
			Thread.sleep(2000);
			
			myThread.suspend();
			System.out.println("B= "+System.currentTimeMillis()+"i= "+myThread.getI());
			Thread.sleep(2000);
			System.out.println("B= "+System.currentTimeMillis()+"i= "+myThread.getI());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
