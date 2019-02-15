package com.yangguangyuan.chapter2.section2.t2.s5;
/**
 * @Description: (这里用一句话描述这个类的作用)
 * @author: yangguangyuan
 * @date: 2019年2月15日 上午9:59:27
 * @version: 1.0
 */
public class ObjectService {

	public void serviceMethodA() {
		try {
			synchronized (this) {
				System.out.println("A beginTime " + System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("A endTime " + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void serviceMethodB() {
		synchronized (this) {
			System.out.println("B beginTime " + System.currentTimeMillis());
			System.out.println("B endTime " + System.currentTimeMillis());
		}
	}
}
