package algorithm.sort;

public class MainTest {

	public static void main(String[] args) {
		int[] sortArr = {1,55,2,-4,78,-435,3,88,3,5,7,-23,-2,0,-1,1,1024};
		Sort sort = null;
		
		System.out.println("=========ð������=========");
		sort = SortFactory.createSort("ð��");
		sort.sort(sortArr);
		
		System.out.println("=========��������=========");
		sort = SortFactory.createSort("����");
		sort.sort(sortArr);
		
		System.out.println("=========ѡ������=========");
		sort = SortFactory.createSort("ѡ��");
		sort.sort(sortArr);
	}
}
