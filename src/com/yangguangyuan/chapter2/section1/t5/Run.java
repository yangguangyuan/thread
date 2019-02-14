package com.yangguangyuan.chapter2.section1.t5;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月13日 下午5:39:44
 * @version: 1.0
 */
public class Run {

	public static void main(String[] args) {
		try {
			PublicVar publicVar = new PublicVar();
			MyThreadA myThreadA = new MyThreadA(publicVar);
			myThreadA.start();
			Thread.sleep(2000);
			publicVar.getValue();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
