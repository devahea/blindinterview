package org.ahea.blindinterview;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@SpringBootApplication
@RestController
@Configuration
@ComponentScan
@EnableAutoConfiguration
//@EnableResourceServer // API 서버 인증(또는 권한 설정)
//@EnableAuthorizationServer // OAuth2 권한 서버
@CrossOrigin(origins="*")
public class ApiApplication extends SpringBootServletInitializer {

	
	@Value("security.oauth2.client.client-id")
	static String OAUTH_CLIENT_ID;
	
//	@Autowired
//    static AuthorizationServerTokenServices tokenservice;
//	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApiApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
		
	}

//	public String getBearerToken(final String username, String... authorities) {
//            // Create OAuth2 token
//            OAuth2Request oauth2Request = new OAuth2Request(null, OAUTH_CLIENT_ID, null, true, null, null, null, null, null);
//            Authentication userauth = new TestingAuthenticationToken(username, null, authorities);
//            OAuth2Authentication oauth2auth = new OAuth2Authentication(oauth2Request, userauth);
//            OAuth2AccessToken token = tokenservice.createAccessToken(oauth2auth);
// 
//            // Set Authorization header to use Bearer
//            return token.getValue();
//    }
//	
	
	@ApiOperation(value = "헬로우 테스트", httpMethod = "POST", notes = "헬로우 테스트입니다")
	@ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid input:..."),
            @ApiResponse(code = 200, message = "Ok" )
            })  
	@ApiImplicitParams({
        @ApiImplicitParam(name = "Authorization", value = "authorization header", required = true,
                dataType = "string", paramType = "header", defaultValue = "bearer ")
	})
	@RequestMapping(value="/", method=RequestMethod.POST )
	public String home() {
		return "Blind Interview Server Running\n";
	}

	
	
	@ApiOperation(value = "헬로우 테스트", httpMethod = "GET", notes = "헬로우 테스트입니다")
	@ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid input:..."),
            @ApiResponse(code = 200, message = "Ok" )
            })  
	@ApiImplicitParams({
        @ApiImplicitParam(name = "Authorization", value = "authorization header", required = true,
                dataType = "string", paramType = "header", defaultValue = "bearer cbbb1a6e-8614-4a4d-a967-b0a42924e7ca")
	})
	@RequestMapping(value="/hello", method=RequestMethod.POST )
	public String hello(@ApiParam(value = "xxx", required = true, defaultValue = "xxx") String value) {
		return "Blind Interview Server Running\n";
	}

}
