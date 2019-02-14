package com.yangguangyuan.chapter1.section8.t2;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 下午5:48:27
 * @version: 1.0
 */
public class Run {

	public static void main(String[] args) {
		try {
			SynchronizedObject object = new SynchronizedObject();
			Thread thread1 = new Thread(){
				@Override
				public void run() {
					object.printString();
				}
			};
			
			thread1.setName("a");
			thread1.start();
			thread1.sleep(1000);
			
			Thread thread2 = new Thread() {
				@Override
				public void run() {
					super.run();
					System.out.println("printString被a线程锁定");
					object.printString();
				}
			};
			
			thread2.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
