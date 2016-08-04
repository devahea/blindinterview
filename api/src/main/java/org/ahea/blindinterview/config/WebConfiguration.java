package org.ahea.blindinterview.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {
	// @Bean
	// ServletRegistrationBean h2servletRegistration(){
	// ServletRegistrationBean registrationBean = new ServletRegistrationBean(
	// new WebServlet());
	// // registrationBean.addUrlMappings("/console/*");
	// return registrationBean;
	// }

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}

}
