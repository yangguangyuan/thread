package com.yangguangyuan.chapter2.section2.t2.s2;

import com.yangguangyuan.chapter2.section1.t6.Service;

/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月15日 上午8:18:37
 * @version: 1.0
 */
public class ThreadA extends Thread{
	private ObjectService objectService;
	
	public ThreadA(ObjectService objectService) {
		// TODO Auto-generated constructor stub
		this.objectService = objectService;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		objectService.serviceMethod();
	}
}
