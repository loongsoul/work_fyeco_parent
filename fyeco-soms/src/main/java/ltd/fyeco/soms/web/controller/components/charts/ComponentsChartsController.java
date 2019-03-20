package ltd.fyeco.soms.web.controller.components.charts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/components/charts")
public class ComponentsChartsController {
	
	private static final String rp = "components/charts/";

	@GetMapping("/flotcharts.html")
	public String userPage() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "flotcharts";
	}

	@GetMapping("/google-charts.html")
	public String googleCharts() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "google-charts";
	}

	@GetMapping("/morris-charts.html")
	public String morrisCharts() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "morris-charts";
	}

}
