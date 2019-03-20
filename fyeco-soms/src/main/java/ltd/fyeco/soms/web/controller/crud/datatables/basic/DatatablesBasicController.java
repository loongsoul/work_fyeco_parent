package ltd.fyeco.soms.web.controller.crud.datatables.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/crud/datatables/basic")
public class DatatablesBasicController {
	
	private static final String rp = "crud/datatables/basic/";

	@GetMapping("/basic.html")
	public String basic() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "basic";
	}

	@GetMapping("/headers.html")
	public String headers() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "headers";
	}

	@GetMapping("/paginations.html")
	public String paginations() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "paginations";
	}

	@GetMapping("/scrollable.html")
	public String scrollable() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "scrollable";
	}

}
