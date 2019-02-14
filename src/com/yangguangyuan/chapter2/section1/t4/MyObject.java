package com.yangguangyuan.chapter2.section1.t4;

import java.awt.geom.CubicCurve2D;

/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月13日 上午7:54:42
 * @version: 1.0
 */
public class MyObject {

	synchronized public void methodA() {
		try {
			System.out.println("begin methodA threadName = "+Thread.currentThread().getName());
			Thread.sleep(5000);
			System.err.println("endTime = "+System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	synchronized public void methodB() {
		try {
			System.out.println("begin methodB threadName = "+Thread.currentThread().getName()+" begin time="+System.currentTimeMillis());
			Thread.sleep(5000);
			System.err.println("end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
