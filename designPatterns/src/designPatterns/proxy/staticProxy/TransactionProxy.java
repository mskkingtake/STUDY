package designPatterns.proxy.staticProxy;

public class TransactionProxy implements DBInterface {
	
	DBInterface dBInterface;

	public TransactionProxy(DBInterface dBInterface) {
		super();
		this.dBInterface = dBInterface;
	}
	
	/**
	 * ��̬������
	 */
	public void saveDate(Object obj) {
		System.out.println("�������...��ʼ");
		dBInterface.saveDate(obj);
		System.out.println("�������...����");
	}
}
