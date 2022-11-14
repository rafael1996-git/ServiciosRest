package com.ine.cartografia.controlador;

import java.io.IOException;


import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
@EnableWebMvc
@Configuration
public class Controlador implements WebMvcConfigurer {

	  @Override
	    public void addViewControllers(ViewControllerRegistry registry) {
	        registry.addViewController("/demo").setViewName("index");

	        
	    }
	   @Override
	    public void configureDefaultServletHandling(
	            DefaultServletHandlerConfigurer configurer) {
	        configurer.enable();
	    }
	   @GetMapping("/demo")
	   public ModelAndView passParametersWithModelAndView() {
		    ModelAndView modelAndView = new ModelAndView("index");

		    return modelAndView;
		}

	  
}
