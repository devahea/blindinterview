//package org.ahea.blindinterview.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//
//@Configuration
//public class MyWebSecurity extends WebSecurityConfigurerAdapter {
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests()
//				.antMatchers(HttpMethod.OPTIONS, "/oauth/token").permitAll();
//
//	}
//
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//
//		web.ignoring().antMatchers("/v2/api-docs", "/configuration/ui",
//				"/swagger-resources", "/configuration/security",
//				"/swagger-ui.html", "/webjars/**","/swagger/**");
//	}
//	
//	
//}
