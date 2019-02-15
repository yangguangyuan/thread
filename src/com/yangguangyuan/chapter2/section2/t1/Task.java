package com.yangguangyuan.chapter2.section2.t1;
/**
 * @Description: (这里用一句话描述这个类的作用)
 * @author: yangguangyuan
 * @date: 2019年2月14日 下午6:30:27
 * @version: 1.0
 */
public class Task {

	private String getDate1;
	private String getDate2;

	synchronized public void doLongTimeTask() {
		try {
			System.out.println("begin task");
			Thread.sleep(3000);
			getDate1 = "长时间处理任务返回1 thread name = "
					+ Thread.currentThread().getName();
			getDate2 = "长时间处理任务返回2 thread name = "
					+ Thread.currentThread().getName();
			
			System.out.println(getDate1);
			System.out.println(getDate2);
			System.out.println("end task");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
