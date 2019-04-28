package designPatterns.factory.springFactorySimple;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.xpath.XPath;

public class ClassPathXmlApplicationContext implements BeanFactory {
	private Map<String, Object> container = new HashMap<String, Object>();
	
	@SuppressWarnings("unchecked")
	public ClassPathXmlApplicationContext(String fileName) throws Exception {
		SAXBuilder saxb = new SAXBuilder();
		Document doc = saxb.build(this.getClass().getClassLoader().getResourceAsStream(fileName));
		
		Element root = doc.getRootElement();
		List<Element> list = XPath.selectNodes(root, "/beans/bean");
		
		for(int i = 0; i < list.size(); i++) {
			Element element = list.get(i);
			String id = element.getAttributeValue("id");
			String clazz = element.getAttributeValue("class");
			
			container.put(id, Class.forName(clazz).getDeclaredConstructor().newInstance());
		}
	}

	@Override
	public Object getBeans(String name) {
		return container.get(name);
	}
}
