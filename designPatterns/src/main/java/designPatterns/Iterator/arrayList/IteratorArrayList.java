package designPatterns.Iterator.arrayList;

public class IteratorArrayList {
	Object[] objects = new Object[10];
	
	int index = 0;
	
	/**
	 * 
	 * @param obj
	 */
	public void add(Object obj) {
		if(index == objects.length) {
			Object[] temp = new Object[objects.length + 10];
			
			System.arraycopy(objects, 0, temp, 0, objects.length);
			objects = temp;
		}
		
		objects[index] = obj;
		index++;
	}
	
	/**
	 * 
	 * @return
	 */
	public int size() {
		return index;
	}
}
