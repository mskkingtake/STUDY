package designPatterns.proxy.staticProxy;

public class AuthorityProxy implements DBInterface {

	DBInterface dBInterface;

	public AuthorityProxy(DBInterface dBInterface) {
		super();
		this.dBInterface = dBInterface;
	}

	/**
	 * 静态代理类
	 */
	public void saveDate(Object obj) {
		System.out.println("检查权限...开始");
		dBInterface.saveDate(obj);
		System.out.println("检查权限...结束");
	}
}
