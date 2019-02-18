package com.yangguangyuan.chapter3.section1.t3.s2;

import java.util.ArrayList;
import java.util.List;

/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月18日 上午7:58:57
 * @version: 1.0
 */
public class MyList {

	private static List list = new ArrayList();

	public static void add() {
		list.add("anyString");
	}
	
	public static int size() {
		return list.size();
	}
}
