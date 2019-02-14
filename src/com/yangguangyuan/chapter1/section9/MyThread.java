package com.yangguangyuan.chapter1.section9;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 下午6:26:26
 * @version: 1.0
 */
public class MyThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		long beginTime = System.currentTimeMillis();
		int count = 0;
		for(int i=0;i<50000000;i++) {
			Thread.yield();
			count = count+(i+1);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("用时:"+(endTime-beginTime));
	}
}
