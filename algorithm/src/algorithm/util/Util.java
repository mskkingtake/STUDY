package algorithm.util;

public class Util {
	
	/**
	 * �������״̬
	 * @param sortArr
	 * @return
	 */
	public static String checkArr(int[] sortArr) {
		if(sortArr == null) {
			return "��������Ϊ��";
		}
		
		if(sortArr.length <= 0) {
			return "��������������";
		}
		
		return null;
	}
	
	/**
	 * ��ʾ����
	 * @param sortArr
	 */
	public static void showArr(int[] sortArr) {
		for(int i : sortArr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
	}
	
	/**
	 * ��������
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
