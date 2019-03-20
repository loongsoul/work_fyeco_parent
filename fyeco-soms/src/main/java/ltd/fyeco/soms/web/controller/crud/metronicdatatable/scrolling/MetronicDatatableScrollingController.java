package ltd.fyeco.soms.web.controller.crud.metronicdatatable.scrolling;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/crud/forms/metronic-datatable/scrolling")
public class MetronicDatatableScrollingController {
	
	private static final String rp = "crud/forms/metronic-datatable/scrolling/";

	@GetMapping("/both.html")
	public String both() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "both";
	}

	@GetMapping("/horizontal.html")
	public String horizontal() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "horizontal";
	}

	@GetMapping("/vertical.html")
	public String vertical() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "vertical";
	}

}
