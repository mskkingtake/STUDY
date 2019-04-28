package algorithm.sort.bean;

import algorithm.sort.Sort;
import algorithm.util.Util;

public class SORT_øÏÀŸ≈≈–Ú implements Sort {
	
	/**
	 * øÏÀŸ≈≈–Ú
	 * @param sortArr
	 */
	public void sort(int[] sortArr) {
		String checkMsg = Util.checkArr(sortArr);
		if(checkMsg != null) {
			System.out.println(checkMsg);
			return;
		}
		
		System.out.println("…˝–Ú≈≈–Ú");
		sortAsc(sortArr, 0, sortArr.length - 1);
		Util.showArr(sortArr);

		System.out.println("Ωµ–Ú≈≈–Ú");
		sortDesc(sortArr, 0, sortArr.length - 1);
		Util.showArr(sortArr);
	}
	
	/**
	 * øÏÀŸ≈≈–Ú-…˝–Ú≈≈–Ú
	 * @param sortArr
	 */
	private void sortAsc(int[] sortArr, int lowPoint, int highPoint) {
		String checkMsg = Util.checkArr(sortArr);
		if(checkMsg != null) {
			System.out.println(checkMsg);
			return;
		}
		
		if(lowPoint < highPoint) {
			int point = setPointAsc(sortArr, lowPoint, highPoint);
			sortAsc(sortArr, lowPoint, point - 1);
			sortAsc(sortArr, point + 1, highPoint);
		}
	}
	
	/**
	 * øÏÀŸ≈≈–Ú-…˝–Ú≈≈–Ú
	 * @param sortArr
	 */
	private int setPointAsc(int[] sortArr, int lowPoint, int highPoint) {
		int temp = sortArr[lowPoint];
		
		while(lowPoint < highPoint) {
			while(lowPoint < highPoint && sortArr[highPoint] >=  temp) {
				highPoint--;
			}
			Util.changeNum(sortArr, lowPoint, highPoint);
			
			while(lowPoint < highPoint && sortArr[lowPoint] <= temp) {
				lowPoint++;
			}
			Util.changeNum(sortArr, lowPoint, highPoint);
		}
		
		return lowPoint;
	}
	
	/**
	 *øÏÀŸ≈≈–Ú- Ωµ–Ú≈≈–Ú
	 * @param sortArr
	 */
	private void sortDesc(int[] sortArr, int lowPoint, int highPoint) {
		String checkMag = Util.checkArr(sortArr);
		if(checkMag != null) {
			System.out.println(checkMag);
			return;
		}
		
		if(lowPoint < highPoint) {
			int point = setPointDesc(sortArr, lowPoint, highPoint);
			sortDesc(sortArr, lowPoint, point - 1);
			sortDesc(sortArr, point + 1, highPoint);
		}
	}
	
	/**
	 * øÏÀŸ≈≈–Ú-Ωµ–Ú≈≈–Ú
	 * @param sortArr
	 */
	private int setPointDesc(int[] sortArr, int lowPoint, int highPoint) {
		int temp = sortArr[lowPoint];
		
		while(lowPoint < highPoint) {
			while(lowPoint < highPoint && sortArr[highPoint] <=  temp) {
				highPoint--;
			}
			Util.changeNum(sortArr, lowPoint, highPoint);
			
			while(lowPoint < highPoint && sortArr[lowPoint] >= temp) {
				lowPoint++;
			}
			Util.changeNum(sortArr, lowPoint, highPoint);
		}
		
		return lowPoint;
	}
}
