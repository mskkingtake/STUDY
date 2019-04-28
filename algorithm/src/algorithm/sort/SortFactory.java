package algorithm.sort;

import algorithm.sort.bean.SORT_ц╟ещеепР;
import algorithm.sort.bean.SORT_©ЛкыеепР;
import algorithm.sort.bean.SORT_я║тЯеепР;

public class SortFactory {
	public static Sort createSort(String type) {
		if("ц╟ещ".equals(type)) {
			return new SORT_ц╟ещеепР();
		} if("©Лкы".equals(type)) {
			return new SORT_©ЛкыеепР();
		} if("я║тЯ".equals(type)) {
			return new SORT_я║тЯеепР();
		} else {
			return null;
		}
	}
}
