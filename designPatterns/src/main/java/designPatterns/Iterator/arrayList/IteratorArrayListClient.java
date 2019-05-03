package designPatterns.Iterator.arrayList;

public class IteratorArrayListClient {

	public static void main(String[] args) {
		IteratorArrayList list = new IteratorArrayList();
		
		for(int i = 0; i < 100; i++) {
			list.add("mskkingtake:" + i);
		}
		
		System.out.println(list.size());
	}
}
