package designPatterns.strategy.simulateJdk.comprartor;

import designPatterns.strategy.simulateJdk.Comparator;
import designPatterns.strategy.simulateJdk.bean.Cat;

public class CatComparator {
	private Comparator<Cat> comparator;

	/**
	 * ˽�л����췽��
	 */
	private CatComparator() {

	}

	private static class CatComparatorClassInstance {
		private static final CatComparator catComparator = new CatComparator();
	}

	/**
	 * ����ģʽ ��̬�ڲ���
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
