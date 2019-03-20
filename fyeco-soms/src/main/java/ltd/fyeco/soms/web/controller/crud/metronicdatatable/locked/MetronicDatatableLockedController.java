package ltd.fyeco.soms.web.controller.crud.metronicdatatable.locked;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/crud/forms/metronic-datatable/locked")
public class MetronicDatatableLockedController {
	
	private static final String rp = "crud/forms/metronic-datatable/locked/";

	@GetMapping("/both.html")
	public String userPage() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "both";
	}

	@GetMapping("/html-table.html")
	public String htmlTable() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "html-table";
	}

	@GetMapping("/left.html")
	public String left() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "left";
	}

	@GetMapping("/right.html")
	public String right() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "right";
	}

}
