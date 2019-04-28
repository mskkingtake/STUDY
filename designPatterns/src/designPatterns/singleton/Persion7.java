package designPatterns.singleton;

import java.io.Serializable;

public class Persion7 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static Persion7 persion7 = null;
	
	/**
	 * ˽�л����췽��
	 */
	private Persion7() {
		// ��ֹ����©��
		if(persion7 != null) {
			throw new RuntimeException();
		}
	}
	
	/**
	 * ����ģʽ
	 * ���л�©��
	 * @return
	 */
	public static synchronized Persion7 getInstance() {
		if(persion7 == null) {
			persion7 = new Persion7();
		}
		
		return persion7;
	}
	
	/**
	 * ���Է�ֹ�����л�
	 * @return
	 */
	/*
	private Object readResolve() {
		return persion7;
	}
	*/
}
