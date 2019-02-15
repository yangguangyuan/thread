package com.yangguangyuan.chapter2.section2.t2.s4;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月15日 上午9:49:22
 * @version: 1.0
 */
public class Thread2 extends Thread {
	private Task task;
	
	public Thread2(Task task) {
		// TODO Auto-generated constructor stub
		this.task =task;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		task.doLongTimeTas();
	}

}
