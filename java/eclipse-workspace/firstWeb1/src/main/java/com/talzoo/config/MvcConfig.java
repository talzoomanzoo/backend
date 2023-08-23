package com.talzoo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc //Enables default Spring MVC configuration and registers Spring MVC infrastructure components expected by the DispatcherServlet. 
public class MvcConfig implements WebMvcConfigurer{

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// TODO Auto-generated method stub
		configurer.enable();
	} // It tells Spring to use the container's default servlet for certain requests, like for static resources

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		registry.jsp("/WEB-INF/views/", ".jsp"); // 사용자가 직접 접근 ㄴㄴ, 주소를 통해 전달하면 뿌려주는 방법으로 (보안 때문) 위치, 해당 폴더 밑의 파일 형식
	} // webapp까지는 직접 들어갈 수 있는데 그 밑으로는 직접 접근 불가함

}
