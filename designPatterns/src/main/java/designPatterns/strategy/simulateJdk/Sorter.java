package designPatterns.strategy.simulateJdk;

public class Sorter {

	@SuppressWarnings("unchecked")
	public static <T> void sort(Comparable<T>[] comparables) {
		for(int i = comparables.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(comparables[j].compareTo((T) comparables[i]) > 0) {
					swap(comparables, i, j);
				}
			}
		}
	}
	
	/**
	 * 
	 * @param <T>
	 * @param comparables
	 */
	public static <T> void print(Comparable<T>[] comparables) {
		for(Comparable<T> comparable : comparables) {
			System.out.print(comparable);
		}
		System.out.println();
	}
	
	/**
	 * 
	 * @param comparables
	 * @param x
	 * @param y
	 */
	private static <T> void swap(Comparable<T>[] comparables, int x, int y) {
		Comparable<T> comparableTemp = comparables[x];
		comparables[x] = comparables[y];
		comparables[y] = comparableTemp;
	}

}
