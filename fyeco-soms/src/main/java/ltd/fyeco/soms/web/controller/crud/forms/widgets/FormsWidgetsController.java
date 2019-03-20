package ltd.fyeco.soms.web.controller.crud.forms.widgets;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ltd.fyeco.soms.common.constants.TemplateConst;
@Controller
@RequestMapping("/crud/forms/widgets")
public class FormsWidgetsController {
	
	private static final String rp = "crud/forms/widgets/";

	@GetMapping("/autosize.html")
	public String autosize() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "autosize";
	}

	@GetMapping("/bootstrap-datepicker.html")
	public String bootstrapDatepicker() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "bootstrap-datepicker";
	}

	@GetMapping("/bootstrap-daterangepicker.html")
	public String bootstrapDaterangepicker() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "bootstrap-daterangepicker";
	}

	@GetMapping("/bootstrap-datetimepicker.html")
	public String bootstrapDatetimepicker() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "bootstrap-datetimepicker";
	}

	@GetMapping("/bootstrap-markdown.html")
	public String bootstrapMarkdown() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "bootstrap-markdown";
	}

	@GetMapping("/bootstrap-maxlength.html")
	public String bootstrapMaxlength() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "bootstrap-maxlength";
	}

	@GetMapping("/bootstrap-multipleselectsplitter.html")
	public String bootstrapMultipleselectsplitter() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "bootstrap-multipleselectsplitter";
	}

	@GetMapping("/bootstrap-select.html")
	public String bootstrapSelect() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "bootstrap-select";
	}

	@GetMapping("/bootstrap-switch.html")
	public String bootstrapSwitch() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "bootstrap-switch";
	}

	@GetMapping("/bootstrap-timepicker.html")
	public String bootstrapTimepicker() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "bootstrap-timepicker";
	}

	@GetMapping("/bootstrap-touchspin.html")
	public String bootstrapTouchspin() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "bootstrap-touchspin";
	}

	@GetMapping("/clipboard.html")
	public String clipboard() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "clipboard";
	}

	@GetMapping("/dropzone.html")
	public String dropzone() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "dropzone";
	}

	@GetMapping("/form-repeater.html")
	public String formRepeater() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "form-repeater";
	}

	@GetMapping("/input-mask.html")
	public String inputMask() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "input-mask";
	}

	@GetMapping("/ion-range-slider.html")
	public String ionRangeSlider() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "ion-range-slider";
	}

	@GetMapping("/nouislider.html")
	public String nouislider() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "nouislider";
	}

	@GetMapping("/recaptcha.html")
	public String recaptcha() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "recaptcha";
	}

	@GetMapping("/select2.html")
	public String select2() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "select2";
	}

	@GetMapping("/summernote.html")
	public String formWidgets() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "summernote";
	}

	@GetMapping("/typeahead.html")
	public String typeahead() {
		return TemplateConst.TEMPLATE_PREFIX + rp + "typeahead";
	}

}
