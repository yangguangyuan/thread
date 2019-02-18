package com.yangguangyuan.chapter3.section1.t3.s2;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月18日 上午8:01:22
 * @version: 1.0
 */
public class ThreadA extends Thread {

	private Object lock;
	
	public ThreadA(Object lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		try {
			synchronized(lock) {
				if(MyList.size()!=5) {
					System.out.println("wait begin "+System.currentTimeMillis());
					lock.wait();
					System.out.println("wait end "+System.currentTimeMillis());
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
