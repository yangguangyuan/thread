package com.yangguangyuan.chapter1.section3;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月11日 下午3:16:17
 * @version: 1.0
 */
public class Run {

	public static void main(String[] args) {
		CountOperate countOperate = new CountOperate();
		Thread thread = new Thread(countOperate);
		thread.setName("A");
//		thread.start();
		thread.run();
	}
}
