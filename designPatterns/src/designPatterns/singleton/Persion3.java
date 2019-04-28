package designPatterns.singleton;

public class Persion3 {
	
	public static Persion3 persion3 = null;
	
	/**
	 * ˽�л����췽��
	 */
	private Persion3() {
		
	}
	
	/**
	 * ����ģʽ
	 * ˫�ؼ����
	 * ż����������
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
