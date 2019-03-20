package ltd.fyeco.soms.web.controller.crud.datatables.advanced;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/crud/datatables/advanced")
public class DatatablesAdvancedController {
	
	private static final String rp = "crud/datatables/advanced/";

	@GetMapping("/column-rendering.html")
	public String columnRendering() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "column-rendering";
	}

	@GetMapping("/column-visibility.html")
	public String columnVisibility() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "column-visibility";
	}

	@GetMapping("/footer-callback.html")
	public String footerCallback() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "footer-callback";
	}

	@GetMapping("/multiple-controls.html")
	public String multipleControls() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "multiple-controls";
	}

	@GetMapping("/row-callback.html")
	public String rowCallback() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "row-callback";
	}

	@GetMapping("/row-grouping.html")
	public String rowGrouping() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "row-grouping";
	}

}
