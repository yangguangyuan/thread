package com.yangguangyuan.chapter2.section2.t2.s2;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月15日 上午8:16:52
 * @version: 1.0
 */
public class ObjectService {

	public void serviceMethod() {
		try {
			synchronized (this) {
				System.out.println("begin Time = "+System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("end Time = "+System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
