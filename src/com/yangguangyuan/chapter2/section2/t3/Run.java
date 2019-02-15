package com.yangguangyuan.chapter2.section2.t3;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月15日 下午1:50:21
 * @version: 1.0
 */
public class Run {

	public static void main(String[] args) {
		PrintString printString = new PrintString();
		new Thread(printString).start();
		System.out.println("要停止!");
		printString.setContinuePrint(false);
	}
}
