package ltd.fyeco.soms.web.controller.snippets.pages.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/snippets/pages/user")
public class PagesUserController {
	
	private static final String rp = "snippets/pages/user/";

	@GetMapping("/pages/login-1.html")
	public String login1() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "system/login-1";
	}

	@GetMapping("/pages/login-2.html")
	public String login2() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "system/login-2";
	}

	@GetMapping("/pages/login-3.html")
	public String login3() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "system/login-3";
	}

	@GetMapping("/pages/login-4.html")
	public String login4() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "system/login-4";
	}

	@GetMapping("/pages/login-5.html")
	public String login5() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "system/login-5";
	}

	@GetMapping("/pages/login-6.html")
	public String login6() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "system/login-6";
	}

}
