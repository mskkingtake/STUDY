package designPatterns.chainOfResponsibility.list;

public interface Filter {
	public void doFilter(Request request, Response response, FilterChain filterChain);
}
