package com.yangguangyuan.chapter2.section1.t4;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月13日 上午7:56:33
 * @version: 1.0
 */
public class ThreadB extends Thread {

	private MyObject myObject;
	public ThreadB(MyObject myObject) {
		// TODO Auto-generated constructor stub
		this.myObject = myObject;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		myObject.methodB();
	}
}
