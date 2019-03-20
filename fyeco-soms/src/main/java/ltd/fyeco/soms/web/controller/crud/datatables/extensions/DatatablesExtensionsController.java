package ltd.fyeco.soms.web.controller.crud.datatables.extensions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/crud/datatables/extensions")
public class DatatablesExtensionsController {
	
	private static final String rp = "crud/datatables/extensions/";

	@GetMapping("/buttons.html")
	public String buttons() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "buttons";
	}

	@GetMapping("/colreorder.html")
	public String colreorder() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "colreorder";
	}

	@GetMapping("/keytable.html")
	public String keytable() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "keytable";
	}

	@GetMapping("/responsive.html")
	public String responsive() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "responsive";
	}

	@GetMapping("/rowgroup.html")
	public String rowgroup() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "rowgroup";
	}

	@GetMapping("/rowreorder.html")
	public String rowreorder() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "rowreorder";
	}

	@GetMapping("/scroller.html")
	public String scroller() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "scroller";
	}

	@GetMapping("/select.html")
	public String select() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "select";
	}

}
