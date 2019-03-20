package ltd.fyeco.soms.service;

import java.io.Serializable;
import java.util.List;

import ltd.fyeco.soms.domain.BaseEntity;
import com.github.pagehelper.PageInfo;

/**
 * 通用服务接口
 * 
 * @author tianxin
 *
 * @param <T>
 * @param <ID>
 */
public interface IGenericService<T extends BaseEntity, ID extends Serializable> {

	/**
	 * 根据主键查询数据
	 * 
	 * @param id
	 * @return
	 */
	T selectByPrimaryKey(Long id);

	/**
	 * 查询所有数据
	 * 
	 * @return
	 */
	List<T> selectAll();

	/**
	 * 根据条件查询一条数据，如果有多条数据会抛出异常
	 * 
	 * @param record
	 * @return
	 */
	T selectOne(T record);

	/**
	 * 根据条件查询数据列表
	 * 
	 * @param record
	 * @return
	 */
	List<T> select(T record);

	/**
	 * 分页查询
	 * 
	 * @param record
	 * @return
	 */
	PageInfo<T> queryPageListByWhere(T record);

	/**
	 * 新增数据，返回成功的条数
	 * 
	 * @param record
	 * @return
	 */
	Integer insert(T record);

	/**
	 * 新增数据，使用不为null的字段，返回成功的条数
	 * 
	 * @param record
	 * @return
	 */
	Integer insertSelective(T record);

	/**
	 * 修改数据，返回成功的条数
	 * 
	 * @param record
	 * @return
	 */
	Integer updateByPrimaryKey(T record);

	/**
	 * 修改数据，使用不为null的字段，返回成功的条数
	 * 
	 * @param record
	 * @return
	 */
	Integer updateByPrimaryKeySelective(T record);

	/**
	 * 根据id删除数据
	 * 
	 * @param id
	 * @return
	 */
	Integer deleteByPrimaryKey(Long id);

	/**
	 * 批量删除
	 * 
	 * @param clazz
	 * @param property
	 * @param values
	 * @return
	 */
	Integer deleteByIds(Class<T> clazz, String property, List<Object> values);

	/**
	 * 根据条件做删除
	 * 
	 * @param record
	 * @return
	 */
	Integer delete(T record);

}
