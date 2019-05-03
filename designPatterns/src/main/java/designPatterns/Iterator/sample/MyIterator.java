package designPatterns.Iterator.sample;

public interface MyIterator {
	public void first();
	public void next();
	public boolean hasNext();
	public boolean isFirst();
	public boolean isLast();
	
	public Object getCurrentObj();

}
