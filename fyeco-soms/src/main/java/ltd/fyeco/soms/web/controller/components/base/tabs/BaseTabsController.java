package ltd.fyeco.soms.web.controller.components.base.tabs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/components/base/tabs")
public class BaseTabsController {
	
	private static final String rp = "components/base/tabs/";

	@GetMapping("/bootstrap.html")
	public String bootstrap() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "bootstrap";
	}

	@GetMapping("/line.html")
	public String line() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "line";
	}

}
