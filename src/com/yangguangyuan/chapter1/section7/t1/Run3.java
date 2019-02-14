package com.yangguangyuan.chapter1.section7.t1;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 上午7:29:30
 * @version: 1.0
 */
public class Run3 {
	
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			System.out.println("是否停止线程1? = "+thread.isInterrupted());
			System.out.println("是否停止线程2? = "+thread.isInterrupted());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
