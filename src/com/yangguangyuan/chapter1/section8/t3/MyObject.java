package com.yangguangyuan.chapter1.section8.t3;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 下午6:15:27
 * @version: 1.0
 */
public class MyObject {
	private String username = "1";
	private String password = "11";
	
	public void setValue(String u,String p) {
		this.username = u;
		if(Thread.currentThread().getName().equals("a")) {
			System.out.println("停止a线程");
			Thread.currentThread().suspend();
		}
		this.password = p;
	}
	
	public void printStr() {
		System.out.println(username+"_"+password);
	}
}
