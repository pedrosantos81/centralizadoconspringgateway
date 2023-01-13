package inicio;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
//@Order(Ordered.HIGHEST_PRECEDENCE)
public class CORSFilter {//implements Filter {

//	@Override
//	public void doFilter(ServletRequest request, ServletResponse resp, FilterChain chain)
//			throws IOException, ServletException {
//		// TODO Auto-generated method stub
//
//		HttpServletRequest req = (HttpServletRequest) request;
//		HttpServletResponse response = (HttpServletResponse) resp;
//		
//		System.out.println("CORSFilter HTTP Request: " + req.getMethod());
//		
//		response.addHeader("Access-Control-Allow-Origin", "*");
//		response.setHeader("Access-Control-Max-Age","-1");
//		response.setHeader("Access-Control-Allow-Origin", "*");
//		response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
//		response.setHeader("Access-Control-Allow-Headers", "Access-Control-Allow-Origin,Access-Control-Allow-Headers,Origin,Accept,X-Requested-With,Access-Control-Request-Headers,Authorization,Access-Control-Request-Method");
//        
////        response.addHeader("Access-Control-Allow-Origin", "*");
////        response.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, PATCH, HEAD");
////        response.addHeader("Access-Control-Allow-Headers", "Origin, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
////        response.addHeader("Access-Control-Expose-Headers", "Access-Control-Allow-Origin, Access-Control-Allow-Credentials");
////        response.addHeader("Access-Control-Allow-Credentials", "false");
////        response.addIntHeader("Access-Control-Max-Age", 10);
//        
//        if ("OPTIONS".equals(req.getMethod())) {
//            response.setStatus(HttpServletResponse.SC_OK);
//        } else { 
//            chain.doFilter(request, response);
//        }
//	}
//	
//	/**
//	   * @see Filter#init(FilterConfig)
//	   */
//	  public void init(FilterConfig fConfig) throws ServletException {
//	    // TODO Auto-generated method stub
//	  }
//
//	/**
//	   * Default constructor.
//	   */
//	  public CORSFilter() {
//	    // TODO Auto-generated constructor stub
//	  }
//	 
//	  /**
//	   * @see Filter#destroy()
//	   */
//	  public void destroy() {
//	    // TODO Auto-generated method stub
//	  }
}

