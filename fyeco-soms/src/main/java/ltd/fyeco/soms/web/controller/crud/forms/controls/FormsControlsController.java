package ltd.fyeco.soms.web.controller.crud.forms.controls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/crud/forms/controls")
public class FormsControlsController {
	
	private static final String rp = "crud/forms/controls/";

	@GetMapping("/base.html")
	public String base() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "base";
	}

	@GetMapping("/checkbox-radio.html")
	public String checkboxRadio() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "checkbox-radio";
	}

	@GetMapping("/input-group.html")
	public String inputGroup() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "input-group";
	}

	@GetMapping("/option.html")
	public String option() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "option";
	}

	@GetMapping("/switch.html")
	public String switch1() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "switch";
	}

}
