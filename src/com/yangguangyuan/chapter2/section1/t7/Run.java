package com.yangguangyuan.chapter2.section1.t7;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月14日 下午6:11:38
 * @version: 1.0
 */
public class Run {
	public static void main(String[] args) {
		try {
			Service service = new Service();
			MyThreadA myThreadA = new MyThreadA(service);
			myThreadA.setName("a");
			myThreadA.start();
			Thread.sleep(2000);
			
			MyThreadB myThreadB = new MyThreadB(service);
			myThreadB.setName("b");
			myThreadB.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
