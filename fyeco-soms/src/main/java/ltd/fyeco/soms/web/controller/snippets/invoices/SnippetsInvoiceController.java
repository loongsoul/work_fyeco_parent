package ltd.fyeco.soms.web.controller.snippets.invoices;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/snippets/invoices")
public class SnippetsInvoiceController {
	
	private static final String rp = "snippets/invoices/";

	@GetMapping("/pages/invoice-1.html")
	public String invoice1() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "system/invoice-1";
	}

	@GetMapping("/pages/invoice-2.html")
	public String invoice2() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "system/invoice-2";
	}

}
