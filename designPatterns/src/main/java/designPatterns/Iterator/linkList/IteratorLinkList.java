package designPatterns.Iterator.linkList;

public class IteratorLinkList {
	Data dataHead = new Data();
	Data currentData = dataHead;
	int index;
	
	public IteratorLinkList() {
		dataHead.setObj("HEAD");
		index = 0;
	}
	
	/**
	 * 
	 * @param obj
	 */
	public void add(Object obj) {
		Data data = new Data();
		data.setObj(obj);
		
		currentData.setNextObj(data);
		
		currentData = data;
		
		index++;
	}
	
	/**
	 * 
	 * @return
	 */
	public int size() {
		return index;
	}
	
	/**
	 * 
	 */
	public void print() {
		Data printData = dataHead;
		while(true) {
			if(printData.getNextObj() == null) {
				break;
			}
			System.out.println(printData.getObj());
			printData = printData.getNextObj();
		}
	}
}
