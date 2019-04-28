package designPatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class MainTest {

	/**
	 * 单例模式
	 * @param args
	 */
	@SuppressWarnings({ "resource", "unchecked" })
	public static void main(String[] args) {
		// 饿汉式-不能延迟加载
		Persion persionA = Persion.getInstance();
		Persion persionB = Persion.getInstance();
		System.out.println("=============饿汉式-不能延迟加载==============");
		System.out.println("persionA:" + persionA);
		System.out.println("persionB:" + persionB);
		
		// 懒汉式-并发效率低
		Persion2 persion2A = Persion2.getInstance();
		Persion2 persion2B = Persion2.getInstance();
		System.out.println("=============懒汉式-并发效率低==============");
		System.out.println("persionA:" + persion2A);
		System.out.println("persionB:" + persion2B);
		
		// 双重检测锁-偶尔出现问题
		Persion3 persion3A = Persion3.getInstance();
		Persion3 persion3B = Persion3.getInstance();
		System.out.println("=============双重检测锁-偶尔出现问题==============");
		System.out.println("persionA:" + persion3A);
		System.out.println("persionB:" + persion3B);
		
		// 静态内部类-常用方式
		Persion4 persion4A = Persion4.getInstance();
		Persion4 persion4B = Persion4.getInstance();
		System.out.println("=============静态内部类-常用方式==============");
		System.out.println("persionA:" + persion4A);
		System.out.println("persionB:" + persion4B);
		
		// 枚举实现-防止反射方式
		Persion5 persion5A = Persion5.INSTANCE;
		Persion5 persion5B = Persion5.INSTANCE;
		persion5A.setName("NAME");
		persion5B.setName("NOBODY");
		System.out.println("=============枚举实现-防止反射方式==============");
		System.out.println("persionA:" + persion5A.getName());
		System.out.println("persionB:" + persion5B.getName());
		
		// 单例模式-反射漏洞
		Persion6 persion6A = Persion6.getInstance();
		Persion6 persion6B = null;
		
		try {
			Class<Persion6> clazz = (Class<Persion6>)Class.forName("designPatterns.singleton.Persion6");
			Constructor<Persion6> constructor = clazz.getDeclaredConstructor(null);
			constructor.setAccessible(true);
			persion6B = constructor.newInstance();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("=============单例模式-反射漏洞==============");
		System.out.println("persionA:" + persion6A);
		System.out.println("persionB:" + persion6B);
		
		// 单例模式-序列化漏洞
		Persion7 persion7A = Persion7.getInstance();
		Persion7 persion7B = Persion7.getInstance();
		
		try {
			FileOutputStream fos = new FileOutputStream("MSK.TXT");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(persion7A);
			oos.close();
			fos.close();
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("MSK.TXT"));
			persion7B = (Persion7)ois.readObject();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("=============单例模式-序列化漏洞==============");
		System.out.println("persionA:" + persion7A);
		System.out.println("persionB:" + persion7B);
	}
}
