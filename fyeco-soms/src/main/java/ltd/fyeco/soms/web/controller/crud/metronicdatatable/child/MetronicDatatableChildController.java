package ltd.fyeco.soms.web.controller.crud.metronicdatatable.child;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/crud/forms/metronic-datatable/child")
public class MetronicDatatableChildController {
	
	private static final String rp = "crud/forms/metronic-datatable/child/";

	@GetMapping("/data-ajax.html")
	public String dataAjax() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "data-ajax";
	}

	@GetMapping("/data-local.html")
	public String dataLocal() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "data-local";
	}

}
