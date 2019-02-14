package com.yangguangyuan.chapter2.section1.t6;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月13日 下午5:49:26
 * @version: 1.0
 */
public class MyThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		Service service = new Service();
		service.service1();
	}
}
