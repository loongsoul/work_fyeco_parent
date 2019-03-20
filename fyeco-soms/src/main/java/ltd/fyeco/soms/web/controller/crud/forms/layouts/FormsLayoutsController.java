package ltd.fyeco.soms.web.controller.crud.forms.layouts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/crud/forms/layouts")
public class FormsLayoutsController {
	
	private static final String rp = "crud/forms/layouts/";

	@GetMapping("/action-bars.html")
	public String actionBars() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "action-bars";
	}

	@GetMapping("/default-forms.html")
	public String defaultForms() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "default-forms";
	}

	@GetMapping("/multi-column-forms.html")
	public String multiColumnForms() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "multi-column-forms";
	}

	@GetMapping("/sticky-action-bar.html")
	public String stickyActionBar() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "sticky-action-bar";
	}

}
