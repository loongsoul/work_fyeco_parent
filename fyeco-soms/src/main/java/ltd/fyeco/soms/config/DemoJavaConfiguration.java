package ltd.fyeco.soms.config;

//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DemoXmlResouceJavaConfiguration.class)
//@EnableAutoConfiguration(exclude = { DemoXmlResouceJavaConfiguration.class })
//@EnableAutoConfiguration(excludeName = { "xxx.yyy.zzz.DemoXmlResouceJavaConfiguration" })
public class DemoJavaConfiguration {

}
