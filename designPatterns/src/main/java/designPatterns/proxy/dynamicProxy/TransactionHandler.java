package designPatterns.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TransactionHandler implements InvocationHandler {

	DBInterface dBInterface;

	public TransactionHandler(DBInterface dBInterface) {
		super();
		this.dBInterface = dBInterface;
	}

	/**
	 * 动态代理类
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("检查事务...开始");
		method.invoke(dBInterface, args);
		System.out.println("检查事务...结束");
		
		return null;
	}
}
