package com.yangguangyuan.chapter1.section7.t1;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月11日 下午5:28:03
 * @version: 1.0
 */
public class Run2 {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
			System.out.println("是否停止线程1? = "+thread.interrupted());
			System.out.println("是否停止线程2? = "+thread.interrupted());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end!");
	}
}
