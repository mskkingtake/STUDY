package designPatterns.proxy.staticProxy;

public class TransactionProxy implements DBInterface {
	
	DBInterface dBInterface;

	public TransactionProxy(DBInterface dBInterface) {
		super();
		this.dBInterface = dBInterface;
	}
	
	/**
	 * 静态代理类
	 */
	public void saveDate(Object obj) {
		System.out.println("检查事务...开始");
		dBInterface.saveDate(obj);
		System.out.println("检查事务...结束");
	}
}
