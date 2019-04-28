package algorithm.sort.bean;

import algorithm.sort.Sort;
import algorithm.util.Util;

public class SORT_ð������ implements Sort {
	
	/**
	 * ð������
	 * @param sortArr
	 */
	public void sort(int[] sortArr) {
		String checkMsg = Util.checkArr(sortArr);
		if(checkMsg != null) {
			System.out.println(checkMsg);
			return;
		}
		
		System.out.println("��������");
		sortAsc(sortArr);
		Util.showArr(sortArr);
		
		System.out.println("��������");
		sortDesc(sortArr);
		Util.showArr(sortArr);
	}
	
	/**
	 * ð������-��������
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
	 * ð������-��������
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
