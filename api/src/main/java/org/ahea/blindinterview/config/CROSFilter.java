package org.ahea.blindinterview.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class CROSFilter extends OncePerRequestFilter {

	@Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        response.addHeader("Access-Control-Allow-Origin", "*");
       if (request.getHeader("Access-Control-Request-Method") != null && "OPTIONS".equals(request.getMethod())); {
           // CORS "pre-flight" request
           response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
           response.addHeader("Access-Control-Allow-Headers", "Authorization");
           response.addHeader("Access-Control-Max-Age", "1728000");
       }
       filterChain.doFilter(request, response);
    }
	
}
