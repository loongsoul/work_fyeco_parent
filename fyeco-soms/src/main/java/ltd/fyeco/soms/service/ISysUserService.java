package ltd.fyeco.soms.service;

import org.apache.ibatis.annotations.Param;

import ltd.fyeco.soms.domain.entity.SysUser;

/**
 * @author tianxin
 */
public interface ISysUserService extends IGenericService<SysUser, Long> {

	/**
	 * 根据用户名加载用户
	 * @param username 用户名
	 * @return
	 */
	SysUser loadUserByUsername(@Param("username") String username);

}
