package com.yangguangyuan.chapter2.section2.t3;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月15日 下午2:55:18
 * @version: 1.0
 */
public class RunThread extends Thread{
	
	volatile private boolean isRunning = true;

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("进入run方法");
		while(true==isRunning) {
			
		}
		
		System.out.println("线程停止");
	}
}
