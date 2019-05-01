package algorithm.math;

import java.util.Date;

public class Factorial {

	public static void main(String[] args) {
		long factorialNum = 20;
		long result1 = getFactorial(factorialNum);
		long result2 = getFactorialByrecursion(factorialNum);
		
		System.out.println(new Date().getTime());
		System.out.println(factorialNum + "�Ľ׳�Ϊ:" + result1);
		System.out.println(new Date().getTime());
		System.out.println(factorialNum + "�Ľ׳�Ϊ:" + result2);
		System.out.println(new Date().getTime());
	}
	
	/**
	 * ��һ�����Ľ׳�-ѭ��
	 * 
	 * @param input
	 * @return
	 */
	private static long getFactorial(long input) {
		long factorialNum = input;
		long result = 1;
		
		for(int i = 1; i <= factorialNum; i++) {
			result = result * i;
		}
		
		return result;
	}
	
	/**
	 * ��һ�����Ľ׳�-�ݹ�
	 * 
	 * @param input
	 * @return
	 */
	private static long getFactorialByrecursion(long input) {
		if(input == 1) {
			return 1;
		} else {
			return getFactorialByrecursion(input - 1) * input;
		}
	}
}
