package ltd.fyeco.soms.config;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.boot.web.server.UndertowServletWebServerFactory;

//import io.undertow.Undertow;

@Configuration
public class CustomServletContainer {//implements UndertowServletWebServerFactory {

//	@Bean
//	UndertowEmbeddedServletContainerFactory embeddedServletContainerFactory() {
//		UndertowEmbeddedServletContainerFactory factory = new UndertowEmbeddedServletContainerFactory();
//
//		// 启用 HTTP2
//		factory.addBuilderCustomizers(builder -> builder.setServerOption(UndertowOptions.ENABLE_HTTP2, true));
//
//		// HTTP 重定向 HTTP2
//		factory.addBuilderCustomizers(new UndertowBuilderCustomizer() {
//			@Override
//			public void customize(Undertow.Builder builder) {
//				builder.addHttpListener(8080, "0.0.0.0");
//			}
//		});
//
//		// HTTP 端口重定向至 HTTPS
//		factory.addDeploymentInfoCustomizers(deploymentInfo -> {
//			deploymentInfo
//					.addSecurityConstraint(new SecurityConstraint()
//							.addWebResourceCollection(new WebResourceCollection().addUrlPattern("/*"))
//							.setTransportGuaranteeType(TransportGuaranteeType.CONFIDENTIAL)
//							.setEmptyRoleSemantic(SecurityInfo.EmptyRoleSemantic.PERMIT))
//					.setConfidentialPortManager(exchange -> 8443);
//		});
//		return factory;
//	}

}
