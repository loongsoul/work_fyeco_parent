package ltd.fyeco.soms.web.controller.crud.metronicdatatable.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/crud/forms/metronic-datatable/api")
public class MetronicDatatableApiController {
	
	private static final String rp = "crud/forms/metronic-datatable/api/";

	@GetMapping("/events.html")
	public String events() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "events";
	}

	@GetMapping("/methods.html")
	public String methods() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "methods";
	}

}
