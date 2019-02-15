package com.yangguangyuan.chapter2.section2.t2.s5;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月15日 上午10:05:35
 * @version: 1.0
 */
public class ThreadB extends Thread{
	private ObjectService objectService;
	
	public ThreadB(ObjectService objectService) {
		// TODO Auto-generated constructor stub
		this.objectService = objectService;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		objectService.serviceMethodB();
	}
}
