package designPatterns.singleton;

public class Persion {
	
	public static final Persion persion = new Persion();
	
	/**
	 * ˽�л����췽��
	 */
	private Persion() {
		
	}
	
	/**
	 * ����ģʽ
	 * ����ʽ
	 * @return
	 */
	public static Persion getInstance() {
		return persion;
	}
}
