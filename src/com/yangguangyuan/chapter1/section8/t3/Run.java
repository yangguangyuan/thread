package com.yangguangyuan.chapter1.section8.t3;
/**
 * @Description: (这里用一句话描述这个类的作用)
 * @author: yangguangyuan
 * @date: 2019年2月12日 下午6:18:52
 * @version: 1.0
 */
public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyObject myObject = new MyObject();
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				myObject.setValue("a", "aa");
			}
		};

		thread1.setName("a");
		thread1.start();
		Thread.sleep(500);
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				myObject.printStr();
			}
		};
		thread2.start();
	}
}
