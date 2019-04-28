package designPatterns.singleton;

public class Persion4 {
	
	/**
	 * ˽�л����췽��
	 */
	private Persion4() {
		
	}
	
	private static class SingletonClassInstance {
		private static final Persion4 persion4 = new Persion4();
	}
	
	/**
	 * ����ģʽ
	 * ��̬�ڲ���
	 * @return
	 */
	public static Persion4 getInstance() {		
		return SingletonClassInstance.persion4;
	}
}
