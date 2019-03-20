package ltd.fyeco.soms.web.controller.components.portlets;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/components/portlets")
public class ComponentsPortletsController {
	
	private static final String rp = "components/portlets/";

	@GetMapping("/advanced.html")
	public String advanced() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "advanced";
	}

	@GetMapping("/base.html")
	public String base() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "base";
	}

	@GetMapping("/creative.html")
	public String creative() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "creative";
	}

	@GetMapping("/draggable.html")
	public String draggable() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "draggable";
	}

	@GetMapping("/sticky-head.html")
	public String stickyHead() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "sticky-head";
	}

	@GetMapping("/tabbed.html")
	public String tabbed() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "tabbed";
	}

	@GetMapping("/tools.html")
	public String tools() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "tools";
	}

}
