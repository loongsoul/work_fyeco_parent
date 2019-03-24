package ltd.fyeco.soms.web.security;

import ltd.fyeco.soms.domain.entity.SysUser;

import ltd.fyeco.soms.service.ISysUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户登录认证实现类
 * 
 * @see UserDetailsSerivce
 * @author tianxin
 * @date 2019/01/01
 */
@Service
public class AuthUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private ISysUserService sysUserService;

	/**
	 * 通过用户名加载用户
	 * <p>
	 * 授权的时候是对角色授权，而认证的时候应该基于资源，而不是角色，<br/>
	 * 因为资源是不变的，而用户的角色是会变的
	 * </p>
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// 获取用户数据
		SysUser sysUser = sysUserService.loadUserByUsername(username);
		if (null == sysUser) {
			throw new UsernameNotFoundException("未找到用户 " + username);
		}

		// 获取角色和权限数据 TODO
//		List<String> roles = roleMapper.getRoleNameBySysUserId(userId);
//		List<String> permission = roleMapper.getRoleNameBySysUserId(userId);
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//		for (SysRole role : systemUser.getRoles()) {
//			for (SysPermission permission : role.getSystemPermissions()) {
//				authorities.add(new SimpleGrantedAuthority(permission.getCode()));
//			}
//		}

		return new User(sysUser.getUsername(), sysUser.getPassword(), authorities);
	}

	/**
	 * 获取权限信息
	 * 
	 * @param uid
	 * @return
	 */
	@SuppressWarnings("unused")
	private String getAuthorities(Long id) {
//		List<String> roles = roleMapper.getRoleNameBySysUserId(userId);
		return "";
	}

}
