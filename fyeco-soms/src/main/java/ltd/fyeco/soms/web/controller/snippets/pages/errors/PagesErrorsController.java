package ltd.fyeco.soms.web.controller.snippets.pages.errors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/snippets/pages/errors")
public class PagesErrorsController {
	
	private static final String rp = "snippets/pages/errors/";

	@GetMapping("/pages/error-1.html")
	public String error1() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "system/error-1";
	}

	@GetMapping("/pages/error-2.html")
	public String error2() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "system/error-2";
	}

	@GetMapping("/pages/error-3.html")
	public String error3() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "system/error-3";
	}

	@GetMapping("/pages/error-4.html")
	public String error4() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "system/error-4";
	}

	@GetMapping("/pages/error-5.html")
	public String error5() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "system/error-5";
	}

	@GetMapping("/pages/error-6.html")
	public String error6() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "system/error6";
	}

}
