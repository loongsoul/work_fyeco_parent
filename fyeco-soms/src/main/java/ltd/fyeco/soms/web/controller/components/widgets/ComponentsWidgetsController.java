package ltd.fyeco.soms.web.controller.components.widgets;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/components/widgets")
public class ComponentsWidgetsController {
	
	private static final String rp = "components/widgets/";

	@GetMapping("/general.html")
	public String general() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "general";
	}
	@GetMapping("/chart.html")
	public String chart() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "chart";
	}

}
