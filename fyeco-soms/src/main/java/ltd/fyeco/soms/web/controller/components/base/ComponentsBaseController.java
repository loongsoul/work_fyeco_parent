package ltd.fyeco.soms.web.controller.components.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/components/base")
public class ComponentsBaseController {
	
	private static final String rp = "components/base/";

	@GetMapping("/accordions.html")
	public String accordions() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "accordions";
	}

	@GetMapping("/alerts.html")
	public String alerts() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "alerts";
	}

	@GetMapping("/blockui.html")
	public String blockui() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "blockui";
	}

	@GetMapping("/bootstrap-notify.html")
	public String bootstrapNotify() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "bootstrap-notify";
	}

	@GetMapping("/dropdown.html")
	public String dropdown() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "dropdown";
	}

	@GetMapping("/lists.html")
	public String lists() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "lists";
	}

	@GetMapping("/modal.html")
	public String modal() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "modal";
	}

	@GetMapping("/navs.html")
	public String navs() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "navs";
	}

	@GetMapping("/popover.html")
	public String popover() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "popover";
	}

	@GetMapping("/progress.html")
	public String progress() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "progress";
	}

	@GetMapping("/scrollable.html")
	public String scrollable() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "scrollable";
	}

	@GetMapping("/spinners.html")
	public String spinners() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "spinners";
	}

	@GetMapping("/stack.html")
	public String stack() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "stack";
	}

	@GetMapping("/state.html")
	public String state() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "state";
	}

	@GetMapping("/sweetalert2.html")
	public String sweetalert2() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "sweetalert2";
	}

	@GetMapping("/tables.html")
	public String tables() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "tables";
	}

	@GetMapping("/toastr.html")
	public String toastr() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "toastr";
	}

	@GetMapping("/tooltip.html")
	public String tooltip() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "tooltip";
	}

	@GetMapping("/treeview.html")
	public String treeview() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "treeview";
	}

	@GetMapping("/typography.html")
	public String typography() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "typography";
	}

}
