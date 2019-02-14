package com.yangguangyuan.chapter2.section1.t4;
/**
 * @Description: (这里用一句话描述这个类的作用)
 * @author: yangguangyuan
 * @date: 2019年2月13日 上午7:58:44
 * @version: 1.0
 */
public class Run {

	public static void main(String[] args) {
		MyObject myObject = new MyObject();
		ThreadA threadA = new ThreadA(myObject);
		threadA.setName("A");
		ThreadB threadB = new ThreadB(myObject);
		threadB.setName("B");
		threadA.start();
		threadB.start();
		
	}
}
