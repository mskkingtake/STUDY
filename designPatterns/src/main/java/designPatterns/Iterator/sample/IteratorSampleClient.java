package designPatterns.Iterator.sample;

public class IteratorSampleClient {

	public static void main(String[] args) {
		ConcreteMyAggregate concreteMyAggregate = new ConcreteMyAggregate();
		for(int i = 0; i < 100; i++) {
			concreteMyAggregate.add("mskkingtake:" + i);
		}
		
		MyIterator myIterator = concreteMyAggregate.createIterator(); 
		while(myIterator.hasNext()) {
			System.out.println(myIterator.getCurrentObj());
			myIterator.next();
		}
	}

}
