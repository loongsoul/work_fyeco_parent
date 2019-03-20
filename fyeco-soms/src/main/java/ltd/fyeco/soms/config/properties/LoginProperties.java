package ltd.fyeco.soms.config.properties;

public class LoginProperties {
	
	private String loginPage = "/loginPage.html";
	
	private String loginProcessingUrl = "/toLogin";
	
	private String usernameParameter = "UM";
	
	private String passwordParameter = "PW";
	
	private String defaultSuccessUrl = "/index";

	public String getLoginPage() {
		return loginPage;
	}

	public void setLoginPage(String loginPage) {
		this.loginPage = loginPage;
	}

	public String getLoginProcessingUrl() {
		return loginProcessingUrl;
	}

	public void setLoginProcessingUrl(String loginProcessingUrl) {
		this.loginProcessingUrl = loginProcessingUrl;
	}

	public String getUsernameParameter() {
		return usernameParameter;
	}

	public void setUsernameParameter(String usernameParameter) {
		this.usernameParameter = usernameParameter;
	}

	public String getPasswordParameter() {
		return passwordParameter;
	}

	public void setPasswordParameter(String passwordParameter) {
		this.passwordParameter = passwordParameter;
	}

	public String getDefaultSuccessUrl() {
		return defaultSuccessUrl;
	}

	public void setDefaultSuccessUrl(String defaultSuccessUrl) {
		this.defaultSuccessUrl = defaultSuccessUrl;
	}
	
	
}
