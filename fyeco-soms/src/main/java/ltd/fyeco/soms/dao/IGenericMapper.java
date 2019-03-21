package ltd.fyeco.soms.dao;

import java.io.Serializable;

import ltd.fyeco.soms.domain.BaseEntity;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用Mapper
 * <li>@MapperScan basePackages 不能扫描此类</li>
 * <li>否则将导致异常 Caused by: java.lang.ClassCastException:
 * sun.reflect.generics.reflectiveObjects.<br>
 * TypeVariableImpl cannot be cast to java.lang.Class</li>
 * 
 * @author tianxin
 *
 * @param <T>
 * @param <ID>
 */
public interface IGenericMapper<T extends BaseEntity, ID extends Serializable> extends Mapper<T>, MySqlMapper<T> {

}
