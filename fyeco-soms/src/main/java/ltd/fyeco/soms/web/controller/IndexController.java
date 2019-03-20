package ltd.fyeco.soms.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import ltd.fyeco.soms.common.constants.TemplateConst;

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
