package algorithm.sort.bean;

import algorithm.sort.Sort;
import algorithm.util.Util;

public class SORT_冒泡排序 implements Sort {
	
	/**
	 * 冒泡排序
	 * @param sortArr
	 */
	public void sort(int[] sortArr) {
		String checkMsg = Util.checkArr(sortArr);
		if(checkMsg != null) {
			System.out.println(checkMsg);
			return;
		}
		
		System.out.println("升序排序");
		sortAsc(sortArr);
		Util.showArr(sortArr);
		
		System.out.println("降序排序");
		sortDesc(sortArr);
		Util.showArr(sortArr);
	}
	
	/**
	 * 冒泡排序-升序排序
	 * @param sortArr
	 */
	private void sortAsc(int[] sortArr) {
		for(int i = 0; i < sortArr.length; i++) {
			for(int j = i + 1; j < sortArr.length; j++) {
				if(sortArr[i] > sortArr[j]) {
					Util.changeNum(sortArr, i, j);
				}
			}
		}
	}
	
	/**
	 * 冒泡排序-降序排序
	 * @param sortArr
	 */
	private void sortDesc(int[] sortArr) {
		for(int i = sortArr.length - 1; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				if(sortArr[i] > sortArr[j]) {
					Util.changeNum(sortArr, i, j);
				}
			}
		}
	}
}
