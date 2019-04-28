package algorithm.sort;

import algorithm.sort.bean.SORT_ð������;
import algorithm.sort.bean.SORT_��������;
import algorithm.sort.bean.SORT_ѡ������;

public class SortFactory {
	public static Sort createSort(String type) {
		if("ð��".equals(type)) {
			return new SORT_ð������();
		} if("����".equals(type)) {
			return new SORT_��������();
		} if("ѡ��".equals(type)) {
			return new SORT_ѡ������();
		} else {
			return null;
		}
	}
}
