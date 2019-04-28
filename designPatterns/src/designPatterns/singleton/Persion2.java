package designPatterns.singleton;

public class Persion2 {
	
	public static Persion2 persion2 = null;
	
	/**
	 * 私有化构造方法
	 */
	private Persion2() {
		
	}
	
	/**
	 * 单例模式
	 * 懒汉式
	 * 并发效率低
	 * @return
	 */
	public static synchronized Persion2 getInstance() {
		if(persion2 == null) {
			persion2 = new Persion2();
		}
		
		return persion2;
	}
}
