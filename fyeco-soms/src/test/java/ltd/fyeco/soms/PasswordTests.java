package ltd.fyeco.soms;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import ltd.fyeco.soms.common.enums.Deleted;
import ltd.fyeco.soms.common.enums.UserStatus;
import ltd.fyeco.soms.config.WebSecurityConfiguration;
import ltd.fyeco.soms.domain.entity.SysUser;
import ltd.fyeco.soms.service.ISysUserService;

/**
 * 密码加密&验证测试类
 * 
 * @author zndo <zndo@live.com>
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PasswordTests {
	private static final Logger logger = LogManager.getLogger(PasswordTests.class);

	String rawPassword = "12345678";

	@Test
	public void contextLoads() {
	}

	/**
	 * 加密测试
	 */
	@Test
	public void encrypt() {
		PasswordEncoder encoder = new BCryptPasswordEncoder();

		logger.info("弱密码: " + rawPassword);

		String encodedPassword = encoder.encode(rawPassword);
		logger.info("强密码: " + encodedPassword);

		boolean b = encoder.matches(rawPassword, encodedPassword);
		logger.info("密码匹配结果: " + b);
	}

}
