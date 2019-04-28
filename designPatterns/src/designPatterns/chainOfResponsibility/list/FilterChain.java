package designPatterns.chainOfResponsibility.list;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
	List<Filter> filters = new ArrayList<Filter>();
	
	public List<Filter> getFilters() {
		return filters;
	}

	public void setFilters(List<Filter> filters) {
		this.filters = filters;
	}

	/**
	 * ����
	 * @param filter
	 * @return
	 */
	public FilterChain addFilter(Filter filter) {
		filters.add(filter);
		return this;
	}
	
	/**
	 * �Ƴ�
	 * @param filter
	 * @return
	 */
	public FilterChain delFilter(Filter filter) {
		filters.remove(filter);
		return this;
	}
	
	int index = 0;

	@Override
	public void doFilter(Request request, Response response, FilterChain filterChain) {
		if(index == filters.size()) {
			response.setResponse("��ʼ����" + request.getRequest());
			return;
		}
		
		Filter filterTemp = filters.get(index);
		index = index + 1;
		filterTemp.doFilter(request, response, filterChain);
	}
}
