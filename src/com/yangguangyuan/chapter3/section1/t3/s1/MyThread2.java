package com.yangguangyuan.chapter3.section1.t3.s1;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月18日 上午7:50:46
 * @version: 1.0
 */
public class MyThread2 extends Thread {

	private Object lock;
	public MyThread2(Object lock) {
		// TODO Auto-generated constructor stub
		this.lock = lock;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			synchronized(lock) {
				System.out.println("start notify time = "+System.currentTimeMillis());
				lock.notify();
				System.out.println("end notify time = "+System.currentTimeMillis());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
