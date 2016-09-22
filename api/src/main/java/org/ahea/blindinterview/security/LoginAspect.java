package org.ahea.blindinterview.security;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Aspect
@Component
public class LoginAspect {

	private static final Logger logger = Logger.getLogger(LoginAspect.class);
	
	@Value("ahea.login.necessary")
	static Boolean loginNecessary;
	
	
	@Around("@annotation(org.ahea.blindinterview.security.UseType) && @ annotation(useType)")
    public Object tilesTitlePoint(ProceedingJoinPoint joinPoint, UseType useType) throws Throwable {
       
		logger.info("Tiles title Aspect called...");
		
		//login necessary가 false일경우 통과
		if(loginNecessary!=null && !loginNecessary) {
			return joinPoint.proceed();
		}

		//로그인이 안되어 있거나 권한이 없다면 login페이지로 이동
		if(LoginActor.newInstance().getUser() == null){
			return new ModelAndView("redirect:/login.do");	
		}
		
		
        //execute the method and get the result
        Object result = joinPoint.proceed();
        
        return result; 
    }
	
}
