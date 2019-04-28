package algorithm.sort.bean;

import algorithm.sort.Sort;
import algorithm.util.Util;

public class SORT_选择排序 implements Sort {
	
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
	 * 选择排序-升序排序
	 * @param sortArr
	 */
	private void sortAsc(int[] sortArr) {
		int x = 0;
		
		for(int i = 0; i < sortArr.length; i++) {
			x = i;
			for(int j = i; j < sortArr.length; j++) {
				if(sortArr[j] < sortArr[x]) {
					x = j;
				}
			}
			
			Util.changeNum(sortArr, i, x);
		}
	}
	
	/**
	 * 选择排序-降序排序
	 * @param sortArr
	 */
	private void sortDesc(int[] sortArr) {
		int x = 0;
		
		for(int i = 0; i < sortArr.length; i++) {
			x = i;
			for(int j = i; j < sortArr.length; j++) {
				if(sortArr[j] > sortArr[x]) {
					x = j;
				}
			}
			
			Util.changeNum(sortArr, i, x);
		}
	}
}
