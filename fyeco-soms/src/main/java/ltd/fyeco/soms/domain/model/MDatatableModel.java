package ltd.fyeco.soms.domain.model;

/**
 * Metronic 表格数据模型
 * 
 * @author tianxin
 *
 */
public class MDatatableModel<T> {

	private MDatatablePageMeta meta; // 元数据
	private T data; // 数据

	// Getters & Setters

	public MDatatablePageMeta getMeta() {
		return meta;
	}

	public void setMeta(MDatatablePageMeta meta) {
		this.meta = meta;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
