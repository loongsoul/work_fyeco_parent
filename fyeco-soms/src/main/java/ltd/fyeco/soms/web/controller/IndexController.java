package ltd.fyeco.soms.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author tianxin
 */
@Controller
public class IndexController {

	@GetMapping({ "/", "index.html" })
	public String indexPage() {
		return "default/index";
	}

}
