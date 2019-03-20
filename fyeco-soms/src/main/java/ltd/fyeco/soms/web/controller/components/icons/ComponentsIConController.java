package ltd.fyeco.soms.web.controller.components.icons;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/components/icons")
public class ComponentsIConController {
	
	private static final String rp = "components/icons/";

	@GetMapping("/flaticon.html")
	public String flaticon() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "flaticon";
	}

	@GetMapping("/fontawesome5.html")
	public String fontawesome5() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "fontawesome5";
	}

	@GetMapping("/lineawesome.html")
	public String lineawesome() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "lineawesome";
	}

	@GetMapping("/socicons.html")
	public String socicons() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "socicons";
	}

}
