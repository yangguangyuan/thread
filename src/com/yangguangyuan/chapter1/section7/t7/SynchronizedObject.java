package com.yangguangyuan.chapter1.section7.t7;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月12日 下午5:23:21
 * @version: 1.0
 */
public class SynchronizedObject {

	private String username = "a";
	private String password = "aa";
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	synchronized public void printString(String username,String password) {
		try {
			this.username = username;
			Thread.sleep(2000);
			this.password = password;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
