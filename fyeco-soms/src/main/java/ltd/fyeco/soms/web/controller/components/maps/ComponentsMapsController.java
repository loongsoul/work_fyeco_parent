package ltd.fyeco.soms.web.controller.components.maps;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/components/maps")
public class ComponentsMapsController {
	
	private static final String rp = "components/maps/";

	@GetMapping("/google-maps.html")
	public String googleMaps() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "google-maps";
	}

	@GetMapping("/jqvmap.html")
	public String jqvmap() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "jqvmap";
	}

}
