package com.yangguangyuan.chapter2.section1.t4;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月13日 上午7:56:33
 * @version: 1.0
 */
public class ThreadA extends Thread {

	private MyObject myObject;
	public ThreadA(MyObject myObject) {
		// TODO Auto-generated constructor stub
		this.myObject = myObject;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		myObject.methodA();
	}
}
