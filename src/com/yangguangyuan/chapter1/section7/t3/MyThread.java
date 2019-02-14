package com.yangguangyuan.chapter1.section7.t3;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 上午7:52:57
 * @version: 1.0
 */
public class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=0;i<500000;i++) {
			if(this.interrupted()) {
				System.out.println("已经是停止状态了!");
				break;
			}
			System.out.println("i="+(i+1));
		}
	}
}
