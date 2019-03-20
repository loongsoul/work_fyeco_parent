package ltd.fyeco.soms.web.controller.snippets.faq;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/snippets/faq")
public class SnippetsFaqController {
	
	private static final String rp = "snippets/faq/";

	@GetMapping("/faq-1.html")
	public String faq1() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "faq-1";
	}

}
