package algorithm.util;

public class Util {
	
	/**
	 * 检查数组状态
	 * @param sortArr
	 * @return
	 */
	public static String checkArr(int[] sortArr) {
		if(sortArr == null) {
			return "传入数组为空";
		}
		
		if(sortArr.length <= 0) {
			return "传入数组无数据";
		}
		
		return null;
	}
	
	/**
	 * 显示数组
	 * @param sortArr
	 */
	public static void showArr(int[] sortArr) {
		for(int i : sortArr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
	}
	
	/**
	 * 交换数据
	 * @param sortArr
	 * @param i
	 * @param j
	 */
	public static void changeNum(int[] sortArr, int i, int j) {
		int intTemp = 0;
		intTemp = sortArr[i];
		sortArr[i] = sortArr[j];
		sortArr[j] = intTemp;
	}
}
