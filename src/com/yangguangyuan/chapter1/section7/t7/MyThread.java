package com.yangguangyuan.chapter1.section7.t7;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 下午5:26:33
 * @version: 1.0
 */
public class MyThread extends Thread {
	
	private SynchronizedObject object;
	
	public MyThread(SynchronizedObject object) {
		this.object = object;
	}
	
	@Override
	public void run() {
		super.run();
		object.printString("b", "bb");
	}
}
