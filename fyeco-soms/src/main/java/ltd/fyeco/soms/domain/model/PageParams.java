package ltd.fyeco.soms.domain.model;

//import java.util.List;
import java.util.Map;

//import com.github.pagehelper.PageHelper;

/**
 * 分页查询请求参数
 * 
 * @author tianxin
 *
 */
public class PageParams<T> {

	private Map<String, String> pagination;
//	private MDatatablePageMeta pagination; // 分页参数
	
	public Map<String, String> getPagination() {
		return pagination;
	}
	public void setPagination(Map<String, String> pagination) {
		this.pagination = pagination;
	}
//	public String[] getPagination() {
//		return pagination;
//	}
//
//	public void setPagination(String[] pagination) {
//		this.pagination = pagination;
//	}
	
}
