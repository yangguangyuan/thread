package com.yangguangyuan.chapter2.section1.t5;
/**
 * @Description: (这里用一句话描述这个类的作用)
 * @author: yangguangyuan
 * @date: 2019年2月13日 下午5:32:37
 * @version: 1.0
 */
public class PublicVar {
	public String username = "A";
	public String password = "AA";

	synchronized public void setValue(String username, String password) {
		try {
			this.username = username;
			Thread.sleep(5000);
			this.password = password;
			System.out.println("setValue method thread name = "
					+ Thread.currentThread().getName() + "username = "
					+ username + "password=" + password);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void getValue() {
		System.out.println(
				"getValue method name = " + Thread.currentThread().getName()
						+ ",username=" + username + ",password=" + password);
	}
}
