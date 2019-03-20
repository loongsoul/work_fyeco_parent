package ltd.fyeco.soms.web.handler;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

@Component
public class AuthenticationFailureHandler {//extends SavedRequestAwareAuthenticationSuccessHandler {
	 
//    private Logger logger = LoggerFactory.getLogger(getClass());
// 
//    private static final ObjectMapper MAPPER = new ObjectMapper();
// 
//    @Autowired
//    private SecurityProperties securityProperties;

//	@Override
//	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
//			Authentication authentication) throws ServletException, IOException {
//
//		 logger.info("登录失败");
		 
//	        if (LoginType.JSON.equals(securityProperties.getBrowser().getLoginType())){
//	            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
//	            response.setContentType("application/json;charset=UTF-8");
//	            response.getWriter().write(MAPPER.writeValueAsString(new SimpleResponse(exception.getMessage())));
//	        }else {
//	            super.onAuthenticationFailure(request, response, exception);
//	        }

//	}
}