package ltd.fyeco.soms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ltd.fyeco.soms.config.properties.SecurityProperties;

@Configuration
public class ValidateCodeBeanConfig {

//    @Autowired
//    private SecurityProperties securityProperties;

//    @Bean
//    @ConditionalOnMissingBean(name = "imageCodeGenerator")
    /**
     * 
     * 
     *
//     * 在触发 ValidateCodeGenerator 之前会检测有没有imageCodeGenerator这个bean。
//     */
//    public ValidateCodeGenerator imageCodeGenerator(){
//        ImageCodeGenerator codeGenerator = new ImageCodeGenerator();
//        codeGenerator.setSecurityProperties(securityProperties);
//        return codeGenerator;
//    }
}
