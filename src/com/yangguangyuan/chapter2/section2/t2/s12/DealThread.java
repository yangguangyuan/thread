package com.yangguangyuan.chapter2.section2.t2.s12;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月15日 上午11:14:34
 * @version: 1.0
 */
public class DealThread implements Runnable{
	private String username;

	public Object lock1 = new Object();
	public Object lock2 = new Object();

	public void setFlag(String username) {
		this.username = username;
	}
	
	@Override
	public void run() {
		if("a".equals(username)) {
			synchronized(lock1) {
				try {
					System.out.println("username = "+username);
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized(lock2) {
					System.out.println("lock1-->lock2");
				}
			}
		}else {
			synchronized(lock2) {
				try {
					System.out.println("username = "+username);
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized(lock1) {
					System.out.println("lock2-->lock1");
				}
			}
		}
	}
	
}
