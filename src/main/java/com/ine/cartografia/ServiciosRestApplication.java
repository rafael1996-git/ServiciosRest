package com.ine.cartografia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
@ComponentScan(basePackages = { "com.ine.cartografia.controlador"} )
@SpringBootApplication
public class ServiciosRestApplication extends WebMvcConfigurationSupport{

	public static void main(String[] args) {
		SpringApplication.run(ServiciosRestApplication.class, args);
	}
	 @Override
	    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/resources/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/resources/");
	        super.addResourceHandlers(registry);
	    }
}
