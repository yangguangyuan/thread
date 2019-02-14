package com.yangguangyuan.chapter2.section1.t6;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月13日 下午5:58:43
 * @version: 1.0
 */
public class Sub extends Main{

	synchronized public void subop() {
		try {
			while(i>0) {
				i--;
				System.out.println("sub print i= "+i);
				Thread.sleep(1000);
				this.mainop();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
