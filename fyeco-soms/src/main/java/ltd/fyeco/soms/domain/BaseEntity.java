package ltd.fyeco.soms.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import org.hibernate.validator.constraints.Range;

/**
 * @author tianxin
 */
public abstract class BaseEntity implements Serializable {

	/**
	 * SerialVersionUID
	 */
	private static final long serialVersionUID = -8869297321087542209L;

	// 基础属性

	/** 标识 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/** 创建者 */
	private Long creator;
	
	/** 创建时间 */
	private Date createTime;
	
	/** 更新时间 */
	private Date updateTime;
	
	/** 删除时间 */
	private Date deleteTime;
	
	/** 删除标识:0-未删除/1-已删除 */
	private Integer deleted;

	// 排序属性
//	private String order = "DESC"; // 排序方法:ASC-升序/DESC-降序
//	private String orderBy = "CREATE_TIME"; // 排序字段
//	private String orderType;

	// 分页属性
//	private Integer offset;
//	@Range(min = 1, max = Integer.MAX_VALUE)
//	private Integer pageNum = 1;
//	@Range(min = 1, max = Integer.MAX_VALUE)
//	private Integer pageSize;
//	private Integer total;
//	private Integer pages;

	// Getters & Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCreator() {
		return creator;
	}

	public void setCreator(Long creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getDeleteTime() {
		return deleteTime;
	}

	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

//	public String getOrder() {
//		return order;
//	}
//
//	public void setOrder(String order) {
//		this.order = order;
//	}
//
//	public String getOrderBy() {
//		return orderBy;
//	}
//
//	public void setOrderBy(String orderBy) {
//		this.orderBy = orderBy;
//	}
//
//	public String getOrderType() {
//		return orderType;
//	}
//
//	public void setOrderType(String orderType) {
//		this.orderType = orderType;
//	}
//
//	public Integer getPageNum() {
//		return pageNum;
//	}
//
//	public void setPageNum(Integer pageNum) {
//		this.pageNum = pageNum;
//	}
//
//	public Integer getOffset() {
//		return offset;
//	}
//
//	public void setOffset(Integer offset) {
//		this.offset = offset;
//	}
//
//	public Integer getPageSize() {
//		return pageSize;
//	}
//
//	public void setPageSize(Integer pageSize) {
//		this.pageSize = pageSize;
//	}

}
