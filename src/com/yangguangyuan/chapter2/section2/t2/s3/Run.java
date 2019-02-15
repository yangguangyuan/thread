package com.yangguangyuan.chapter2.section2.t2.s3;
/**   
 * @Description: (这里用一句话描述这个类的作用)  
 * @author: yangguangyuan  
 * @date: 2019年2月14日 下午6:38:21
 * @version: 1.0
 */
public class Run {
	
	public static void main(String[] args) {
		Task task = new Task();
		ThreadA threadA = new ThreadA(task);
		threadA.start();
		ThreadB threadB = new ThreadB(task);
		threadB.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long beginTime = CommonUtils.beginTime1;
		if(CommonUtils.beginTime1>CommonUtils.beginTime2) {
			beginTime = CommonUtils.beginTime2;
		}
		
		long endTime = CommonUtils.endTime1;
		if(CommonUtils.endTime1<CommonUtils.endTime2) {
			endTime = CommonUtils.endTime2;
		}
		
		System.out.println("耗时:"+(endTime-beginTime));
	}
}
