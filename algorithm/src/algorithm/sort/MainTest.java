package algorithm.sort;

public class MainTest {

	public static void main(String[] args) {
		int[] sortArr = {1,55,2,-4,78,-435,3,88,3,5,7,-23,-2,0,-1,1,1024};
		Sort sort = null;
		
		System.out.println("=========冒泡排序=========");
		sort = SortFactory.createSort("冒泡");
		sort.sort(sortArr);
		
		System.out.println("=========快速排序=========");
		sort = SortFactory.createSort("快速");
		sort.sort(sortArr);
		
		System.out.println("=========选择排序=========");
		sort = SortFactory.createSort("选择");
		sort.sort(sortArr);
	}
}
