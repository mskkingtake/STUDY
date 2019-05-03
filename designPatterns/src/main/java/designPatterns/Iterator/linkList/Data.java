package designPatterns.Iterator.linkList;

public class Data {
	Object obj;
	Data nextObj;
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Data getNextObj() {
		return nextObj;
	}
	public void setNextObj(Data nextObj) {
		this.nextObj = nextObj;
	}
}
