package designPatterns.Iterator.sample;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMyAggregate {
	
	private List<Object> list = new ArrayList<Object>();
	
	public void add(Object obj) {
		this.list.add(obj);
	}
	
	public void remove(Object obj) {
		this.remove(obj);
	}
	
	public MyIterator createIterator() {
		return new ConcreteIterator();
	}
	
	@SuppressWarnings("unused")
	private class ConcreteIterator implements MyIterator {
		
		private int cursor = 0;

		@Override
		public void first() {
			cursor = 0;
		}

		@Override
		public void next() {
			if(cursor < list.size()) {
				cursor++;
			}
		}

		@Override
		public boolean hasNext() {
			if(cursor < list.size()) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public boolean isFirst() {
			return cursor == 0?true:false;
		}

		@Override
		public boolean isLast() {
			return cursor == list.size()?true:false;
		}

		@Override
		public Object getCurrentObj() {
			return list.get(cursor);
		}
	}
}
