package com.yangguangyuan.chapter2.section1.t2;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月13日 上午7:30:37
 * @version: 1.0
 */
public class HasSelfPrivteNum {
	private int num = 0;
	synchronized public void addI(String username) {
		try {
			
			if("a".equals(username)) {
				num	= 100;
				System.out.println("a set over!");
				Thread.sleep(1000);
			}else {
				num = 200;
				System.out.println("b set over");
			}
			System.out.println(username+" num= "+num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
