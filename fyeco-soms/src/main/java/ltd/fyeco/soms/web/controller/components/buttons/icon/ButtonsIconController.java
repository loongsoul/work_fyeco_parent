package ltd.fyeco.soms.web.controller.components.buttons.icon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/components/buttons/icon")
public class ButtonsIconController {
	
	private static final String rp = "components/buttons/icon/";

	@GetMapping("/flaticon.html")
	public String flaticon() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "flaticon";
	}

	@GetMapping("/fontawesome.html")
	public String fontawesome() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "fontawesome";
	}

	@GetMapping("/lineawesome.html")
	public String lineawesome() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "lineawesome";
	}

}
