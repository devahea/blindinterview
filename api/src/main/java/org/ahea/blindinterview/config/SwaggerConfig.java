package org.ahea.blindinterview.config;

import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.GrantType;
import springfox.documentation.service.ImplicitGrant;
import springfox.documentation.service.LoginEndpoint;
import springfox.documentation.service.OAuth;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import com.google.common.collect.Lists;

@Configuration
@EnableSwagger2
@EnableAutoConfiguration
public class SwaggerConfig {


	    @Bean
	    public Docket swaggerSpringMvcPlugin() {
	    	return new Docket(DocumentationType.SWAGGER_2)          
	        .select()                                       
	        .apis(RequestHandlerSelectors.basePackage("org.ahea.blindinterview"))
	        .build();
//	        .securitySchemes(Lists.newArrayList(securitySchema()));
//	        .securityContexts(Lists.newArrayList(securityContext()));
	    }
	    
	    public static final String securitySchemaOAuth2 = "oauth2schema";
	    public static final String authorizationScopeGlobal = "global";
	    public static final String authorizationScopeGlobalDesc ="accessEverything";
	    
	    
	    private OAuth securitySchema() {
	        AuthorizationScope authorizationScope = new AuthorizationScope(authorizationScopeGlobal, authorizationScopeGlobal);
	        LoginEndpoint loginEndpoint = new LoginEndpoint("http://localhost:9999/sso/login");
	        GrantType grantType = new ImplicitGrant(loginEndpoint, "access_token");
	        return new OAuth(securitySchemaOAuth2, Lists.newArrayList(authorizationScope), Lists.newArrayList(grantType));
	    }
	    
	    private SecurityContext securityContext() {
	        return SecurityContext.builder()
	                .securityReferences(defaultAuth())
	                .build();
	    }
	    
	    private List<SecurityReference> defaultAuth() {
	        AuthorizationScope authorizationScope
	                = new AuthorizationScope(authorizationScopeGlobal, authorizationScopeGlobalDesc);
	        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
	        authorizationScopes[0] = authorizationScope;
	        return Lists.newArrayList(new SecurityReference(securitySchemaOAuth2, authorizationScopes));
	    }

}
