package designPatterns.singleton;

public class Persion2 {
	
	public static Persion2 persion2 = null;
	
	/**
	 * ˽�л����췽��
	 */
	private Persion2() {
		
	}
	
	/**
	 * ����ģʽ
	 * ����ʽ
	 * ����Ч�ʵ�
	 * @return
	 */
	public static synchronized Persion2 getInstance() {
		if(persion2 == null) {
			persion2 = new Persion2();
		}
		
		return persion2;
	}
}
