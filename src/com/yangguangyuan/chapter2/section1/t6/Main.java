package com.yangguangyuan.chapter2.section1.t6;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月13日 下午5:56:44
 * @version: 1.0
 */
public class Main {

	public int i = 10;
	
	synchronized public void mainop() {
		try {
			i--;
			System.out.println("main print i="+i);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
