package designPatterns.Iterator.linkList;

public class IteratorArrayListClient {

	public static void main(String[] args) {
		IteratorLinkList list = new IteratorLinkList();
		
		for(int i = 0; i < 100; i++) {
			list.add("mskkingtake:" + i);
		}
		
		list.print();
	}
}
