package algorithm.math;

public class Sum {

	public static void main(String[] args) {
		long sum = 100;
		long result = 0;
		result = getSum(sum);
		
		System.out.println("���1��" + sum + "�Ľ׺�:" + result);
	}
	
	/**
	 * ���1��ĳ�����ĺ�
	 * 
	 * @param input
	 * @return
	 */
	private static long getSum(long input) {
		long result = 0;
		
		int i = 0;
		while(i <= input) {
			result = result + i;
			i++;
		}
		
		return result;
	}
}
