package com.yangguangyuan.chapter3.section1.t3.s2;

/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月18日 上午8:01:22
 * @version: 1.0
 */
public class ThreadB extends Thread {

	private Object lock;
	
	public ThreadB(Object lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		try {
			synchronized(lock) {
				for(int i=0;i<10;i++) {
					MyList.add();
					if(MyList.size()==5) {
						lock.notify();
						System.out.println("已经发出通知");
					}
					System.out.println("添加了"+(i+1)+"个元素");
					Thread.sleep(1000);
				}
				
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
