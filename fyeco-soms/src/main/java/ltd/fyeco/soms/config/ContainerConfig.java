package ltd.fyeco.soms.config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * 
 * @author zndo
 *
 */
@Configuration
public class ContainerConfig implements ErrorPageRegistrar {

	/**
	 * 注册错误页面
	 */
	@Override
	public void registerErrorPages(ErrorPageRegistry registry) {
		ErrorPage[] errorPages = new ErrorPage[2];
		// 内部服务器错误
		errorPages[0] = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/error/500");
		// 资源未找到
		errorPages[1] = new ErrorPage(HttpStatus.NOT_FOUND, "/error/404");
		registry.addErrorPages(errorPages);
	}

}
