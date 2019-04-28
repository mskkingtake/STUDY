package designPatterns.singleton;

public class Persion6 {
	
	public static Persion6 persion6 = null;
	
	/**
	 * ˽�л����췽��
	 */
	private Persion6() {
		/* ��ֹ����©��
		if(persion6 != null) {
			throw new RuntimeException();
		}
		*/
	}
	
	/**
	 * ����ģʽ
	 * ����©��
	 * @return
	 */
	public static synchronized Persion6 getInstance() {
		if(persion6 == null) {
			persion6 = new Persion6();
		}
		
		return persion6;
	}
}
