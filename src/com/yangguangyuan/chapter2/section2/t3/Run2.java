package com.yangguangyuan.chapter2.section2.t3;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月15日 下午2:57:12
 * @version: 1.0
 */
public class Run2 {
	
	public static void main(String[] args) {
		try {
			RunThread runThread = new RunThread();
			runThread.start();	
			Thread.sleep(1000);
			
			runThread.setRunning(false);
			System.out.println("已经赋值为false");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
