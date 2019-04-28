package designPatterns.singleton;

import java.io.Serializable;

public class Persion7 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static Persion7 persion7 = null;
	
	/**
	 * 私有化构造方法
	 */
	private Persion7() {
		// 防止反射漏洞
		if(persion7 != null) {
			throw new RuntimeException();
		}
	}
	
	/**
	 * 单例模式
	 * 序列化漏洞
	 * @return
	 */
	public static synchronized Persion7 getInstance() {
		if(persion7 == null) {
			persion7 = new Persion7();
		}
		
		return persion7;
	}
	
	/**
	 * 可以防止反序列化
	 * @return
	 */
	/*
	private Object readResolve() {
		return persion7;
	}
	*/
}
