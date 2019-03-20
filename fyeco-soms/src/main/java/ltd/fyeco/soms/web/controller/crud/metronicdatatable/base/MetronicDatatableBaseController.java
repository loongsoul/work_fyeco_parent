package ltd.fyeco.soms.web.controller.crud.metronicdatatable.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/crud/metronic-datatable/base")
public class MetronicDatatableBaseController {
	
	private static final String rp = "crud/metronic-datatable/base/";

	@GetMapping("/auto-column-hide.html")
	public String autoColumnHide() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "auto-column-hide";
	}

	@GetMapping("/column-rendering.html")
	public String columnRendering() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "column-rendering";
	}

	@GetMapping("/column-width.html")
	public String columnWidth() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "column-width";
	}

	@GetMapping("/data-ajax.html")
	public String dataAjax() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "data-ajax";
	}

	@GetMapping("/data-json.html")
	public String dataJson() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "data-json";
	}

	@GetMapping("/data-local.html")
	public String dataLocal() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "dataLocal";
	}

	@GetMapping("/html-table.html")
	public String htmlTable() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "html-table";
	}

	@GetMapping("/local-sort.html")
	public String localSort() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "local-sort";
	}

	@GetMapping("/record-selection.html")
	public String recordSelection() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "recordSelection";
	}

	@GetMapping("/responsive-columns.html")
	public String responsiveColumns() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "responsive-columns";
	}

	@GetMapping("/row-details.html")
	public String rowDetails() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "row-details";
	}

	@GetMapping("/translation.html")
	public String translation() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "translation";
	}

}
