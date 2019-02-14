package com.yangguangyuan.chapter1.section8.t2;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 下午6:02:27
 * @version: 1.0
 */
public class MyThread extends Thread {
	private long i = 0;
	@Override
	public void run() {
		while (true) {
			i++;
//			System.out.println(i);
		}
	}
}
