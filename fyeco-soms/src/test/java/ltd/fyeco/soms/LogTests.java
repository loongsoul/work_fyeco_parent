package ltd.fyeco.soms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LogTests {
	
	private static final Logger logger = LoggerFactory.getLogger(LogTests.class);

	@Test
	public void contextLoads() {
	}

	// Log4j2 测试
	@Test
	public void log4j2Test() {

		logger.error("Log4j2 错误日志。");
	}

}
