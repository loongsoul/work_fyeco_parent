package ltd.fyeco.soms.domain.model;

import org.hibernate.validator.constraints.Range;

/**
 * Metronic 表格元数据
 * 
 * @author tianxin
 *
 */
public class MDatatablePageMeta {

	// -- pagination
	@Range(min = 1, max = Integer.MAX_VALUE)
	private Integer page = 1; // 当前页码
	@Range(min = 1, max = Integer.MAX_VALUE)
	private Integer pages = 1; // 总页数
	@Range(min = 1, max = Integer.MAX_VALUE)
	private Integer perpage = -1; // 每页数据大小
	@Range(min = 1, max = Integer.MAX_VALUE)
	private Long total = 0L; // 数据总数
	
	// -- sort
	private String sort = "asc"; // 排序规则
	private String field = "RecordID"; // 记录编号
	
	// -- query

	// Getters & Setters

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Integer getPerpage() {
		return perpage;
	}

	public void setPerpage(Integer perpage) {
		this.perpage = perpage;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

}
