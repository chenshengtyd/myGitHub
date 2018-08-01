package com.whcs.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class IndexFilter
 */
@WebFilter("/IndexFilter")
public class IndexFilter implements Filter {
    public IndexFilter() {
    }

	public void destroy() {
	}

	/*这是过滤器执行操作的方法*/
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("我是IndexFileter过滤器的处理方法！！");
		/*此方法是做你真正要做的事情，说白就是进入下一步*/
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
