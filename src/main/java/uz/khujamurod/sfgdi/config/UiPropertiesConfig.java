package uz.khujamurod.sfgdi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import uz.khujamurod.sfgdi.examplebean.UIProperties;

@Configuration
@PropertySource("classpath:ui.properties")
public class UiPropertiesConfig {

    @Value("${response.format}")
    private String format;

    @Value("${response.timeout}")
    private Integer timeout;

    @Bean
    public UIProperties uiProperties() {
        UIProperties uiProperties = new UIProperties();
        uiProperties.setFormat(format);
        uiProperties.setTimeout(timeout);
        return uiProperties;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
