package ltd.fyeco.soms.web.controller.crud.wizard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/crud/wizard")
public class CrudWizardController {
	
	private static final String rp = "crud/wizard/";

	@GetMapping("/wizard-1.html")
	public String wizard1() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "wizard-1";
	}

	@GetMapping("/wizard-2.html")
	public String wizard2() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "wizard-2";
	}

	@GetMapping("/wizard-3.html")
	public String wizard3() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "wizard-3";
	}

	@GetMapping("/wizard-4.html")
	public String wizard4() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "wizard-4";
	}

	@GetMapping("/wizard-5.html")
	public String wizard5() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "wizard-5";
	}

}
