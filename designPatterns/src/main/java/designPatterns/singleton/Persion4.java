package designPatterns.singleton;

public class Persion4 {
	
	/**
	 * 私有化构造方法
	 */
	private Persion4() {
		
	}
	
	private static class SingletonClassInstance {
		private static final Persion4 persion4 = new Persion4();
	}
	
	/**
	 * 单例模式
	 * 静态内部类
	 * @return
	 */
	public static Persion4 getInstance() {		
		return SingletonClassInstance.persion4;
	}
}
