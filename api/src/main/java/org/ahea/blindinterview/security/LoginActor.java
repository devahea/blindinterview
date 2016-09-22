package org.ahea.blindinterview.security;

import org.ahea.blindinterview.model.vo.GenericUser;
import org.apache.log4j.Logger;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class LoginActor {

	private static final Logger logger = Logger.getLogger(LoginActor.class);
	
	public static final String LOGIN_KEY = "login_user";
	
	private LoginActor(){}
	
	public static LoginActor newInstance() {
		return new LoginActor();
	}
	
	
	public void loginProcess(GenericUser user) throws Exception {
		
		logger.info("try login - " + user);
		
		if(user == null) {
			throw new Exception("can not found user");
		}
		
		((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession().setAttribute(LOGIN_KEY, user);
		
	}
	
	public GenericUser getUser() {
		return (GenericUser) ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession().getAttribute(LOGIN_KEY);
	}
	
}
