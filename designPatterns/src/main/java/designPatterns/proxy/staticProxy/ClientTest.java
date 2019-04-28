package designPatterns.proxy.staticProxy;

public class ClientTest {

	/**
	 * 静态代理测试
	 * @param args
	 */
	public static void main(String[] args) {
		DbLodaer dbLodaer = new DbLodaer();
		
		TransactionProxy transactionProxy = new TransactionProxy(dbLodaer);
		
		AuthorityProxy AuthorityProxy = new AuthorityProxy(transactionProxy);
		
		AuthorityProxy.saveDate(new Object());
	}
}
