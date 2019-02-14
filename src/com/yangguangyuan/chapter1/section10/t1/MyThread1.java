package com.yangguangyuan.chapter1.section10.t1;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 下午6:43:09
 * @version: 1.0
 */
public class MyThread1 extends Thread {
	@Override
	public void run() {
		super.run();
		System.out.println("MyThread1 run priority="+this.getPriority());
		MyThread1 myThread1 = new MyThread1();
		
		myThread1.interrupt();
		boolean interrupted = myThread1.isInterrupted();
		if(interrupted) {
			myThread1.start();
		}
	}
}
