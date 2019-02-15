package com.yangguangyuan.chapter2.section2.t4;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月15日 下午3:20:04
 * @version: 1.0
 */
public class MyThread extends Thread{

	volatile public static int count;
	
	synchronized private static void addCount() {
		for(int i=0;i<100;i++) {
			count++;
		}
		
		System.out.println("count="+count);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		addCount();
	}
}
