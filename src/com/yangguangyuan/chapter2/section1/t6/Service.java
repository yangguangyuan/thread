package com.yangguangyuan.chapter2.section1.t6;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月13日 下午5:46:39
 * @version: 1.0
 */
public class Service {

	synchronized public void service1() {
		System.out.println("service1");
		service2();
	}

	synchronized void service2() {
		System.out.println("service2");
		service3();
	}
	
	synchronized public void service3() {
		System.out.println("service3");
	}
}
