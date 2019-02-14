package com.yangguangyuan.chapter2.section1.t3;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月13日 上午7:36:24
 * @version: 1.0
 */
public class Run {
	public static void main(String[] args) {
		HasSelfPrivteNum numRef = new HasSelfPrivteNum();
		HasSelfPrivteNum numRefB = new HasSelfPrivteNum();
		ThreadA threadA = new ThreadA(numRef);
		threadA.start();
		ThreadB threadB = new ThreadB(numRefB);
		threadB.start();
	}
}
