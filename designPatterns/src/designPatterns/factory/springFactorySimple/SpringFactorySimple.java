package designPatterns.factory.springFactorySimple;

public class SpringFactorySimple {

	/**
	 * Spring IOC ģ��
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		String fileName = "designPatterns/factory/springFactorySimple/applicationContext.xml";
		BeanFactory beanFactory = new ClassPathXmlApplicationContext(fileName);
		
		Animal animal = (Animal)beanFactory.getBeans("dog");
		animal.cry();
	}
}
