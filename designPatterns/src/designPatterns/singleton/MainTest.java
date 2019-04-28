package designPatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class MainTest {

	/**
	 * ����ģʽ
	 * @param args
	 */
	@SuppressWarnings({ "resource", "unchecked" })
	public static void main(String[] args) {
		// ����ʽ-�����ӳټ���
		Persion persionA = Persion.getInstance();
		Persion persionB = Persion.getInstance();
		System.out.println("=============����ʽ-�����ӳټ���==============");
		System.out.println("persionA:" + persionA);
		System.out.println("persionB:" + persionB);
		
		// ����ʽ-����Ч�ʵ�
		Persion2 persion2A = Persion2.getInstance();
		Persion2 persion2B = Persion2.getInstance();
		System.out.println("=============����ʽ-����Ч�ʵ�==============");
		System.out.println("persionA:" + persion2A);
		System.out.println("persionB:" + persion2B);
		
		// ˫�ؼ����-ż����������
		Persion3 persion3A = Persion3.getInstance();
		Persion3 persion3B = Persion3.getInstance();
		System.out.println("=============˫�ؼ����-ż����������==============");
		System.out.println("persionA:" + persion3A);
		System.out.println("persionB:" + persion3B);
		
		// ��̬�ڲ���-���÷�ʽ
		Persion4 persion4A = Persion4.getInstance();
		Persion4 persion4B = Persion4.getInstance();
		System.out.println("=============��̬�ڲ���-���÷�ʽ==============");
		System.out.println("persionA:" + persion4A);
		System.out.println("persionB:" + persion4B);
		
		// ö��ʵ��-��ֹ���䷽ʽ
		Persion5 persion5A = Persion5.INSTANCE;
		Persion5 persion5B = Persion5.INSTANCE;
		persion5A.setName("NAME");
		persion5B.setName("NOBODY");
		System.out.println("=============ö��ʵ��-��ֹ���䷽ʽ==============");
		System.out.println("persionA:" + persion5A.getName());
		System.out.println("persionB:" + persion5B.getName());
		
		// ����ģʽ-����©��
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
		
		System.out.println("=============����ģʽ-����©��==============");
		System.out.println("persionA:" + persion6A);
		System.out.println("persionB:" + persion6B);
		
		// ����ģʽ-���л�©��
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
		
		System.out.println("=============����ģʽ-���л�©��==============");
		System.out.println("persionA:" + persion7A);
		System.out.println("persionB:" + persion7B);
	}
}
