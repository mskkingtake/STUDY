package designPatterns.singleton;

import java.util.concurrent.CountDownLatch;

public class EfficiencyTest {
	
	public static int THREAD_NUM = 100;
	public static CountDownLatch countDownLatch = new CountDownLatch(THREAD_NUM);

	public static void main(String[] args) throws Exception {
		EfficiencyTest efficiencyTest = new EfficiencyTest();
		efficiencyTest.getEfficiency();
	}
	
	/**
	 * 执行效率测试
	 */
	private void getEfficiency() throws Exception {
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < THREAD_NUM; i++) {
			Efficiency efficiency = new Efficiency();
			new Thread(efficiency).start();
		}
		
		countDownLatch.await();
		
		long end = System.currentTimeMillis();
		System.out.println("耗时为:" + (end - start));
	}
}

class Efficiency implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 10000000; i++) {
			Object object = Persion.getInstance();
//			Object object = Persion5.INSTANCE;
		}
		
		EfficiencyTest.countDownLatch.countDown();
	}
}
