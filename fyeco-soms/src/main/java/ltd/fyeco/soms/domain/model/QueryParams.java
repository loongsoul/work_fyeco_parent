package ltd.fyeco.soms.domain.model;

//import java.util.List;
import java.util.Map;

//import com.github.pagehelper.PageHelper;

/**
 * 分页请求参数
 * 
 * @author tianxin
 *
 */
public class QueryParams<T> {

//	private Integer pageSize; // 页面数据大小
//	private Integer currentPage; // 当前页码
//	private Integer total; // 总记录数
//	private Integer totalPage; // 总页数
//
//	private List<T> items;// 分页数据

	private Map<String, String> query; // 查询参数
	
	public Map<String, String> getQuery() {
		return query;
	}
	public void setQuery(Map<String, String> query) {
		this.query = query;
	}

}
