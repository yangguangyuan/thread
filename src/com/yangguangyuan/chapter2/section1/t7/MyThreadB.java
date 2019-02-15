package com.yangguangyuan.chapter2.section1.t7;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月14日 下午6:09:58
 * @version: 1.0
 */
public class MyThreadB extends Thread {

	private Service service;
	public MyThreadB(Service service) {
		// TODO Auto-generated constructor stub
		this.service = service;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		service.testMethod();
	}
}
