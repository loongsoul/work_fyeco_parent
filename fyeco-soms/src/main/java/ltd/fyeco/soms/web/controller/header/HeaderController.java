package ltd.fyeco.soms.web.controller.header;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/header")
public class HeaderController {
	
	private static final String rp = "header/";

	@GetMapping("/actions.html")
	public String actions() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "actions";
	}

	@GetMapping("/profile.html")
	public String profile() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "profile";
	}

}
