package com.yangguangyuan.chapter1.section7.t1;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 上午7:29:30
 * @version: 1.0
 */
public class Run21 {
	
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("是否停止线程1? = "+Thread.interrupted());
		System.out.println("是否停止线程2? = "+Thread.interrupted());
	}
}
