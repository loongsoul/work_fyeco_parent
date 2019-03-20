package ltd.fyeco.soms.web.controller.snippets.general.pricingtables;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/snippets/general/pricing-tables")
public class GeneralPricingTablesController {
	
	private static final String rp = "snippets/general/pricing-tables";

	@GetMapping("/pricing-table-1.html")
	public String pricingTable1() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "system/pricing-table-1";
	}

	@GetMapping("/pricing-table-2.html")
	public String pricingTable2() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "system/pricing-table-2";
	}

	@GetMapping("/pricing-table-3.html")
	public String pricingTable3() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "system/pricing-table-3";
	}

	@GetMapping("/pricing-table-4.html")
	public String pricingTable4() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "system/pricing-table-4";
	}
	
}
