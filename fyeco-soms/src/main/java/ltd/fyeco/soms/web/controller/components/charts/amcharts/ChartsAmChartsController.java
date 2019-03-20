package ltd.fyeco.soms.web.controller.components.charts.amcharts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/components/charts/amcharts")
public class ChartsAmChartsController {
	
	private static final String rp = "components/charts/amcharts/";

	@GetMapping("/charts.html")
	public String charts() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "charts";
	}

	@GetMapping("/maps.html")
	public String maps() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "maps";
	}

	@GetMapping("/stock-charts.html")
	public String stockCharts() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "stock-charts";
	}

}
