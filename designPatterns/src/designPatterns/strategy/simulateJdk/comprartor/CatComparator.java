package designPatterns.strategy.simulateJdk.comprartor;

import designPatterns.strategy.simulateJdk.Comparator;
import designPatterns.strategy.simulateJdk.bean.Cat;

public class CatComparator {
	private Comparator<Cat> comparator;

	/**
	 * 私有化构造方法
	 */
	private CatComparator() {

	}

	private static class CatComparatorClassInstance {
		private static final CatComparator catComparator = new CatComparator();
	}

	/**
	 * 单例模式 静态内部类
	 * 
	 * @return
	 */
	public static CatComparator getInstance() {
		return CatComparatorClassInstance.catComparator;
	}

	public Comparator<Cat> getComparator() {
		return comparator;
	}

	public void setComparator(Comparator<Cat> comparator) {
		this.comparator = comparator;
	}
}
