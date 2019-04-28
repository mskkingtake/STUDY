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
	 * ��̬������
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("�������...��ʼ");
		method.invoke(dBInterface, args);
		System.out.println("�������...����");
		
		return null;
	}
}
