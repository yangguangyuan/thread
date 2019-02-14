package com.yangguangyuan.chapter1.section6;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月11日 下午5:10:36
 * @version: 1.0
 */
public class Test {
	
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+"_"+thread.getId());
	}
}
