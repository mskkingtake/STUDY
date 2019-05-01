package algorithm.math;

import java.util.Date;

public class Factorial {

	public static void main(String[] args) {
		long factorialNum = 20;
		long result1 = getFactorial(factorialNum);
		long result2 = getFactorialByrecursion(factorialNum);
		
		System.out.println(new Date().getTime());
		System.out.println(factorialNum + "的阶乘为:" + result1);
		System.out.println(new Date().getTime());
		System.out.println(factorialNum + "的阶乘为:" + result2);
		System.out.println(new Date().getTime());
	}
	
	/**
	 * 计算阶乘-循环方式
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
	 * 计算阶乘-递归方式
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
