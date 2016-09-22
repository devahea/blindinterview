package org.ahea.blindinterview.util;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class TilesTitleAop {

	private static final Logger logger = Logger.getLogger(TilesTitleAop.class);
	
	@Around("@annotation(org.ahea.blindinterview.util.TilesTitle) && @ annotation(tilesTitle)")
    public Object tilesTitlePoint(ProceedingJoinPoint joinPoint, TilesTitle tilesTitle) throws Throwable {
       
		logger.info("Tiles title Aspect called...");
		
        //execute the method and get the result
        Object result = joinPoint.proceed();
        
        if(tilesTitle.value() != null) {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            
            request.setAttribute("tilesTitle", tilesTitle.value());
            
            logger.info("Request put Attribute tilesTitle - " + tilesTitle.value());
        }
        
        return result; 
    }
	
	
}
