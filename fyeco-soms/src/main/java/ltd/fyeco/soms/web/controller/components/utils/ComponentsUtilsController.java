package ltd.fyeco.soms.web.controller.components.utils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/components/utils")
public class ComponentsUtilsController {
	
	private static final String rp = "components/utils/";

	@GetMapping("/idle-timer.html")
	public String idleTimer() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "idle-timer";
	}

	@GetMapping("/session-timeout.html")
	public String sessionTimeout() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "session-timeout";
	}

}
