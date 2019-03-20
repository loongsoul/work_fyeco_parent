package ltd.fyeco.soms.dao;

import java.io.Serializable;

import ltd.fyeco.soms.domain.BaseEntity;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用Mapper
 * 
 * @author tianxin
 *
 * @param <T>
 * @param <ID>
 */
public interface IGenericMapper<T extends BaseEntity, ID extends Serializable> extends Mapper<T>, MySqlMapper<T> {

}
