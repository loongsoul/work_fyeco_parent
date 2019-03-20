package ltd.fyeco.soms.web.controller.crud.forms.validation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/crud/forms/validation")
public class FormsValidationController {
	
	private static final String rp = "crud/forms/validation/";

	@GetMapping("/form-controls.html")
	public String formControls() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "form-controls";
	}

	@GetMapping("/form-widgets.html")
	public String formWidgets() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "form-widgets";
	}

	@GetMapping("/states.html")
	public String states() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "states";
	}

}
