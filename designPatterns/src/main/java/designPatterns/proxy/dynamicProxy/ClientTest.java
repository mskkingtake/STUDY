package designPatterns.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class ClientTest {

	/**
	 * 动态代理测试
	 * @param args
	 */
	public static void main(String[] args) {
		DBInterface dbInterface = new DbLodaer();
		AuthorityHandler authorityHandler = new AuthorityHandler(dbInterface);
//		TransactionHandler transactionHandler = new TransactionHandler(dbInterface);
		
		DBInterface dbLodaerProxy =(DBInterface) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{DBInterface.class}, authorityHandler);
		dbLodaerProxy.saveDate(args);
	}
}
