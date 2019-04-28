package designPatterns.chainOfResponsibility.list;

import designPatterns.chainOfResponsibility.list.filter.PunctuationFilter;
import designPatterns.chainOfResponsibility.list.filter.SensitiveFilter;
import designPatterns.chainOfResponsibility.list.filter.SymbolFilter;

public class ClientTest {

	public static void main(String[] args) {
		Request request = new Request();
		Response response = new Response();
		
		request.setRequest("(^^),你好，民主，禁言，阴暗，嘲笑，贸易战。$$%%");
		
		// 入参
		System.out.println("Request:::" + request.getRequest());
		
		FilterChain filterChain = new FilterChain();
		filterChain.addFilter(new SymbolFilter()).addFilter(new SensitiveFilter()).addFilter(new PunctuationFilter());
		filterChain.doFilter(request, response, filterChain);
		
		// 回参
		System.out.println("Response:::" + response.getResponse());
	}
}
