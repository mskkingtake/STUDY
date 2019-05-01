package algorithm.math;

public class TowerofHanoi {
	
	static long step = 1;

	public static void main(String[] args) {
		String A = "Aλ��";
		String B = "Bλ��";
		String C = "Cλ��";
		
		getTowerofHanoi(15, A, B, C);
	}

	/**
	 * 
	 * @param count �ܸ���
	 * @param A ԭʼλ��
	 * @param B �м�λ��
	 * @param C Ŀ��λ��
	 * @return
	 */
	private static void getTowerofHanoi(long count, String A, String B, String C) {
		if(count == 1) {
			System.out.println("��" + step+++ "��->" + count + "���:::" + A + "--->" + C);
		} else {
			getTowerofHanoi(count - 1, A, C, B);
			System.out.println("��" + step+++ "��->" + count + "���:::" + A + "--->" + C);
			getTowerofHanoi(count - 1, B, A, C);
		}
	}
}
