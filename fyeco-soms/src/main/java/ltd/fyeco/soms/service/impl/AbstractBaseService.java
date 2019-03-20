package ltd.fyeco.soms.service.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import ltd.fyeco.soms.service.IGenericService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import ltd.fyeco.soms.dao.IGenericMapper;
import ltd.fyeco.soms.domain.BaseEntity;
//import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import tk.mybatis.mapper.entity.Example;

/**
 * 抽象通用服务接口实现类
 * 
 * @author tianxin
 *
 * @param <T>
 * @param <ID>
 */
public abstract class AbstractBaseService<T extends BaseEntity, ID extends Serializable>
		implements IGenericService<T, ID> {

	private static final Logger LOGGER = LogManager.getLogger(AbstractBaseService.class);

	@Autowired
	private IGenericMapper<T, ID> genericMapper;

	/**
	 * 根据主键查询数据
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public T selectByPrimaryKey(Long id) {
		LOGGER.info("selectByPrimaryKey");
		return genericMapper.selectByPrimaryKey(id);
	}

	/**
	 * 查询所有数据
	 * 
	 * @return
	 */
	@Override
	public List<T> selectAll() {
		return genericMapper.selectAll();
	}

	/**
	 * 根据条件查询一条数据，如果有多条数据会抛出异常
	 * 
	 * @param record
	 * @return
	 */
	@Override
	public T selectOne(T record) {
		return genericMapper.selectOne(record);
	}

	/**
	 * 根据条件查询数据列表
	 * 
	 * @param record
	 * @return
	 */
	@Override
	public List<T> select(T record) {
		return genericMapper.select(record);
	}

	/**
	 * 分页查询
	 * 
	 * @param record
	 * @return
	 */
	@Override
	public PageInfo<T> queryPageListByWhere(T record) {
		// 设置分页条件
//		PageHelper.startPage(record.getPageNum(), record.getPageSize());
		List<T> list = this.select(record);
		return new PageInfo<T>(list);
	}

	/**
	 * 新增数据，返回成功的条数
	 * 
	 * @param record
	 * @return
	 */
	@Override
	public Integer insert(T record) {
		record.setCreateTime(new Date());
		record.setUpdateTime(record.getCreateTime());
		return genericMapper.insert(record);
	}

	/**
	 * 新增数据，使用不为null的字段，返回成功的条数
	 * 
	 * @param record
	 * @return
	 */
	@Override
	public Integer insertSelective(T record) {
		record.setCreateTime(new Date());
		record.setUpdateTime(record.getCreateTime());
		return genericMapper.insertSelective(record);
	}

	/**
	 * 修改数据，返回成功的条数
	 * 
	 * @param record
	 * @return
	 */
	@Override
	public Integer updateByPrimaryKey(T record) {
		return genericMapper.updateByPrimaryKey(record);
	}

	/**
	 * 修改数据，使用不为null的字段，返回成功的条数
	 * 
	 * @param record
	 * @return
	 */
	@Override
	public Integer updateByPrimaryKeySelective(T record) {
		record.setUpdateTime(record.getCreateTime());
		return genericMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 根据id删除数据
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Integer deleteByPrimaryKey(Long id) {
		return genericMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 * 
	 * @param clazz
	 * @param property
	 * @param values
	 * @return
	 */
	@Override
	public Integer deleteByIds(Class<T> clazz, String property, List<Object> values) {
		Example example = new Example(clazz);
		example.createCriteria().andIn(property, values);
		return genericMapper.deleteByExample(example);
	}

	/**
	 * 根据条件做删除
	 * 
	 * @param record
	 * @return
	 */
	@Override
	public Integer delete(T record) {
		return genericMapper.delete(record);
	}

}
