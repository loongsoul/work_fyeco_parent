package ltd.fyeco.soms.web.controller.components.timeline;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/components/timeline")
public class ComponentsTimelineController {
	
	private static final String rp = "components/timeline/";

	@GetMapping("/timeline-1.html")
	public String timeline1() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "timeline-1";
	}

	@GetMapping("/timeline-2.html")
	public String timeline2() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "timeline-2";
	}

}
