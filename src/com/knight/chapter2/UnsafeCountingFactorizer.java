package com.knight.chapter2;

import java.io.IOException;
import java.math.BigInteger;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 存在一个共享的访问资源count变量
 * ++ count 不是原子性操作，分3步，先取值（读），再自增，最后赋值（写） 读-改-写
 * 多个线程存在资源的竞争，假设初始9，同时加1，同时变成10，显然违背了请求一次自增一次的原则
 * @author hujie
 *
 */
public class UnsafeCountingFactorizer  implements Servlet{

	private long count = 0;
	public long getCount(){
		return count;
	}
	


	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
	
		BigInteger i = extractFromRequest(req);
		BigInteger[] factors = factor(i);
		++ count;
		encodeIntoResponse(resp,factors);
	}



	private void encodeIntoResponse(ServletResponse resp, BigInteger[] factors) {
		// TODO Auto-generated method stub
		
	}



	private BigInteger[] factor(BigInteger i) {
		// TODO Auto-generated method stub
		return null;
	}



	private BigInteger extractFromRequest(ServletRequest req) {
		// TODO Auto-generated method stub
		return null;
	}



	public void destroy() {
		// TODO Auto-generated method stub
		
	}



	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}



	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}
