package designPatterns.proxy.staticProxy;

public class AuthorityProxy implements DBInterface {

	DBInterface dBInterface;

	public AuthorityProxy(DBInterface dBInterface) {
		super();
		this.dBInterface = dBInterface;
	}

	/**
	 * ��̬������
	 */
	public void saveDate(Object obj) {
		System.out.println("���Ȩ��...��ʼ");
		dBInterface.saveDate(obj);
		System.out.println("���Ȩ��...����");
	}
}
