package algorithm.sort.bean;

import algorithm.sort.Sort;
import algorithm.util.Util;

public class SORT_—°‘Ò≈≈–Ú implements Sort {
	
	/**
	 * √∞≈›≈≈–Ú
	 * @param sortArr
	 */
	public void sort(int[] sortArr) {
		String checkMsg = Util.checkArr(sortArr);
		if(checkMsg != null) {
			System.out.println(checkMsg);
			return;
		}
		
		System.out.println("…˝–Ú≈≈–Ú");
		sortAsc(sortArr);
		Util.showArr(sortArr);
		
		System.out.println("Ωµ–Ú≈≈–Ú");
		sortDesc(sortArr);
		Util.showArr(sortArr);
	}
	
	/**
	 * —°‘Ò≈≈–Ú-…˝–Ú≈≈–Ú
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
	 * —°‘Ò≈≈–Ú-Ωµ–Ú≈≈–Ú
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
