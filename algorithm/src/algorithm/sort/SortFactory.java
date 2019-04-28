package algorithm.sort;

import algorithm.sort.bean.SORT_冒泡排序;
import algorithm.sort.bean.SORT_快速排序;
import algorithm.sort.bean.SORT_选择排序;

public class SortFactory {
	public static Sort createSort(String type) {
		if("冒泡".equals(type)) {
			return new SORT_冒泡排序();
		} if("快速".equals(type)) {
			return new SORT_快速排序();
		} if("选择".equals(type)) {
			return new SORT_选择排序();
		} else {
			return null;
		}
	}
}
