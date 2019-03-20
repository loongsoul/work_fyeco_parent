package ltd.fyeco.soms.web.controller.components.calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/components/calendar")
public class ComponentsCalendarController {
	
	private static final String rp = "components/calendar/";

	@GetMapping("/background-events.html")
	public String backgroundEvents() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "background-events";
	}

	@GetMapping("/basic.html")
	public String basic() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "basic";
	}

	@GetMapping("/external-events.html")
	public String externalEvents() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "external-events";
	}

	@GetMapping("/google.html")
	public String google() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "google";
	}

	@GetMapping("/list-view.html")
	public String listView() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "list-view";
	}

}
