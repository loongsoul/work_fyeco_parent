package ltd.fyeco.soms.web.controller.components.buttons.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/components/buttons/base")
public class ButtonsBaseController {
	
	private static final String rp = "components/buttons/base/";

	@GetMapping("/air.html")
	public String air() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "air";
	}

	@GetMapping("/default.html")
	public String default1() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "default";
	}

	@GetMapping("/pill.html")
	public String pill() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "pill";
	}

	@GetMapping("/square.html")
	public String square() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "square";
	}

}
