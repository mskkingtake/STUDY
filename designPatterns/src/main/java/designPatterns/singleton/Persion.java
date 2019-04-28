package designPatterns.singleton;

public class Persion {
	
	public static final Persion persion = new Persion();
	
	/**
	 * 私有化构造方法
	 */
	private Persion() {
		
	}
	
	/**
	 * 单例模式
	 * 饿汉式
	 * @return
	 */
	public static Persion getInstance() {
		return persion;
	}
}
