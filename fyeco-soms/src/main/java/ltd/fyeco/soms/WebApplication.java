package ltd.fyeco.soms;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * @author zndo
 *
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = { "ltd.fyeco.soms.dao.mapper" })
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}
