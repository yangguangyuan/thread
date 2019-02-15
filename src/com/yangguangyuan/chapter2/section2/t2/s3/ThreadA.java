package com.yangguangyuan.chapter2.section2.t2.s3;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月14日 下午6:36:22
 * @version: 1.0
 */
public class ThreadA extends Thread{

	private Task task;
	
	public ThreadA(Task task) {
		// TODO Auto-generated constructor stub
		this.task = task;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		CommonUtils.beginTime1 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtils.endTime1 = System.currentTimeMillis();
	}
}
