package com.yangguangyuan.chapter2.section1.t1;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月13日 上午7:33:26
 * @version: 1.0
 */
public class ThreadA extends Thread{
	
	private HasSelfPrivteNum numRef;
	
	public ThreadA(HasSelfPrivteNum numRef) {
		// TODO Auto-generated constructor stub
		this.numRef = numRef;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		numRef.addI("a");
	}
}
