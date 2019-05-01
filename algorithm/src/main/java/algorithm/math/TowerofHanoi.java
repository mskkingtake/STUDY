package algorithm.math;

public class TowerofHanoi {
	
	static long step = 1;

	public static void main(String[] args) {
		String A = "A位置";
		String B = "B位置";
		String C = "C位置";
		
		getTowerofHanoi(5, A, B, C);
	}

	/**
	 * 处理汉诺塔
	 * @param count 
	 * @param A A位置
	 * @param B B位置
	 * @param C C位置
	 */
	private static void getTowerofHanoi(long count, String A, String B, String C) {
		if(count == 1) {
			System.out.println("步骤" + step+++ "：编号->" + count + "的盘子:::" + A + "--->" + C);
		} else {
			getTowerofHanoi(count - 1, A, C, B);
			System.out.println("步骤" + step+++ "：编号->" + count + "的盘子:::" + A + "--->" + C);
			getTowerofHanoi(count - 1, B, A, C);
		}
	}
}
