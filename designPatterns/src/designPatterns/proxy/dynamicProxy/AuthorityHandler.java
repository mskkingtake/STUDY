package designPatterns.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AuthorityHandler implements InvocationHandler {

	DBInterface dBInterface;

	public AuthorityHandler(DBInterface dBInterface) {
		super();
		this.dBInterface = dBInterface;
	}

	/**
	 * ��̬������
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("���Ȩ��...��ʼ");
		method.invoke(dBInterface, args);
		System.out.println("���Ȩ��...����");
		
		return null;
	}
}
