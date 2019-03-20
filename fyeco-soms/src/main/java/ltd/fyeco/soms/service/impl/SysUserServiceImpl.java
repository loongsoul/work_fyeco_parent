package ltd.fyeco.soms.service.impl;

import ltd.fyeco.soms.dao.mapper.ISysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ltd.fyeco.soms.domain.entity.SysUser;
import ltd.fyeco.soms.service.ISysUserService;

/**
 * @author tianxin
 */
@Transactional
@Service
public class SysUserServiceImpl extends AbstractBaseService<SysUser, Long> implements ISysUserService {

//	private static final Logger LOGGER = LogManager.getLogger(AbstractCommonService.class);

	@Autowired
	private ISysUserMapper sysUserMapper;

	@Cacheable(cacheNames = "authority", key = "#username")
	@Override
	public SysUser loadUserByUsername(String username) {
		return sysUserMapper.loadByUsername(username);
	}

}
