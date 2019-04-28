package designPatterns.chainOfResponsibility.list.filter;

import designPatterns.chainOfResponsibility.list.Filter;
import designPatterns.chainOfResponsibility.list.FilterChain;
import designPatterns.chainOfResponsibility.list.Request;
import designPatterns.chainOfResponsibility.list.Response;

public class SymbolFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain filterChain) {
		request.setRequest(request.getRequest().replace("Òõ°µ", "¹âÃ÷") + "\n" + "---SymbolFilter---");
		filterChain.doFilter(request, response, filterChain);
		response.setResponse(response.getResponse() + "\n" + "---SymbolFilter---");
	}
}
