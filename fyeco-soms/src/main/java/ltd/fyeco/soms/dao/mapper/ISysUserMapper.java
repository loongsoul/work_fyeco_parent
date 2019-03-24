package ltd.fyeco.soms.dao.mapper;

import org.apache.ibatis.annotations.Param;

import ltd.fyeco.soms.dao.IGenericMapper;
import ltd.fyeco.soms.domain.entity.SysUser;

/**
 * @author tianxin
 */
//@Mapper
public interface ISysUserMapper extends IGenericMapper<SysUser, Long> {

	/**
	 * 根据用户名加载系统用户
	 * @param username
	 * @return
	 */
	SysUser loadUserByUsername(@Param("username") String username);

}
