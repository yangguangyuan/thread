package com.yangguangyuan.chapter2.section1.t7;
/**
 * @Description: (这里用一句话描述这个类的作用)
 * @author: yangguangyuan
 * @date: 2019年2月13日 下午6:05:56
 * @version: 1.0
 */
public class Service {

	synchronized public void testMethod() {
		if (Thread.currentThread().getName().equals("a")) {
			System.out.println("thread Aname" + Thread.currentThread().getName()
					+ "begin time" + System.currentTimeMillis());

			int i = 1;
			while (i == 1) {
				if (("" + Math.random()).substring(0, 8).equals("0.123456")) {
					System.out.println(
							"ThreadName=" + Thread.currentThread().getName()
									+ "run exceptionTime= "
									+ System.currentTimeMillis());
//					Integer.parseInt("a");
				}
			}
		}else {
			System.out.println("thread B runTime= " + System.currentTimeMillis());
		}
	}
}
