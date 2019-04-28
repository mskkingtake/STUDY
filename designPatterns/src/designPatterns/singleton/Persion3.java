package designPatterns.singleton;

public class Persion3 {
	
	public static Persion3 persion3 = null;
	
	/**
	 * 私有化构造方法
	 */
	private Persion3() {
		
	}
	
	/**
	 * 单例模式
	 * 双重检测锁
	 * 偶尔出现问题
	 * @return
	 */
	public static Persion3 getInstance() {
		if(persion3 == null) {
			synchronized (Persion3.class) {
				if(persion3 == null) {
					persion3 = new Persion3();
				}
			}
		}
		
		return persion3;
	}
}
