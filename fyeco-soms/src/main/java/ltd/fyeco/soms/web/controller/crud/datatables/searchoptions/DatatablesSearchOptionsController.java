package ltd.fyeco.soms.web.controller.crud.datatables.searchoptions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/crud/datatables/search-options")
public class DatatablesSearchOptionsController {
	
	private static final String rp = "crud/datatables/search-options/";

	@GetMapping("/advanced-search.html")
	public String advancedSearch() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "advanced-search";
	}

	@GetMapping("/column-search.html")
	public String columnSearch() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "column-search";
	}

}
