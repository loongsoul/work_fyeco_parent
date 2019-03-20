package ltd.fyeco.soms.web.controller.crud.datatables.datasources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/crud/datasources")
public class DatatablesDatasourcesController {
	
	private static final String rp = "crud/datasources/";

	@GetMapping("/ajax-client-side.html")
	public String ajaxClientSide() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "ajax-client-side";
	}

	@GetMapping("/ajax-server-side.html")
	public String ajaxServerSide() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "ajax-server-side";
	}

	@GetMapping("/html.html")
	public String html() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "html";
	}

	@GetMapping("/javascript.html")
	public String javascript() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "javascript";
	}

}
