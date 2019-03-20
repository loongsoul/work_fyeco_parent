package ltd.fyeco.soms.web.controller.components.buttons;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/components/buttons")
public class ComponentsButtonsController {
	
	private static final String rp = "components/buttons/";

	@GetMapping("/dropdown.html")
	public String dropdown() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "dropdown";
	}

	@GetMapping("/group.html")
	public String group() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "group";
	}

	@GetMapping("/spinner.html")
	public String spinner() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "spinner";
	}

}
