package com.yangguangyuan.chapter1.section7.t7;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 下午5:28:25
 * @version: 1.0
 */
public class Run {

	public static void main(String[] args) {
		try {
			SynchronizedObject object = new SynchronizedObject();
			MyThread myThread = new MyThread(object);
			myThread.start();
			Thread.sleep(1000);
			myThread.stop();
			System.out.println(object.getUsername()+"_"+object.getPassword());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
