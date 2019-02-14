package com.yangguangyuan.chapter2.section1.t5;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月13日 下午5:38:03
 * @version: 1.0
 */
public class MyThreadA extends Thread{

	public PublicVar publicVar;
	public MyThreadA(PublicVar publicVar) {
		// TODO Auto-generated constructor stub
		this.publicVar = publicVar;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		publicVar.setValue("B", "BB");
	}
}
