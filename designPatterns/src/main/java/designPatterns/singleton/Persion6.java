package designPatterns.singleton;

public class Persion6 {
	
	public static Persion6 persion6 = null;
	
	/**
	 * 私有化构造方法
	 */
	private Persion6() {
		/* 防止反射漏洞
		if(persion6 != null) {
			throw new RuntimeException();
		}
		*/
	}
	
	/**
	 * 单例模式
	 * 反射漏洞
	 * @return
	 */
	public static synchronized Persion6 getInstance() {
		if(persion6 == null) {
			persion6 = new Persion6();
		}
		
		return persion6;
	}
}
