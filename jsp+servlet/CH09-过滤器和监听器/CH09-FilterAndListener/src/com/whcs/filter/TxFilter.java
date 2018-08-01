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
 * Servlet Filter implementation class TxFilter
 */
@WebFilter("/TxFilter")
public class TxFilter implements Filter {

    /**
     * Default constructor. 
     */
    public TxFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String parameter = request.getParameter("message");//Tx是垃圾
		System.out.println("parameter={" + parameter +"}");
		if(parameter != null && parameter != ""){
			String message = parameter.replaceAll("Tx", "腾讯");
			message = message.replaceAll("tx", "腾讯");
			System.out.println("message=" + message);
			request.setAttribute("message", message);
		}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
