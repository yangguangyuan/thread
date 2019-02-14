package com.yangguangyuan.chapter1.section8.t1;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 下午5:37:30
 * @version: 1.0
 */
public class MyThread extends Thread {

	private long i = 0;

	public long getI() {
		return i;
	}

	public void setI(long i) {
		this.i = i;
	}
	
	@Override
	public void run() {
		while(true) {
			i++;
		}
	}
}
