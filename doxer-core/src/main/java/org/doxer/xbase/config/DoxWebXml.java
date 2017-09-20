package org.doxer.xbase.config;

import org.doxer.xbase.filter.ThreadLocalInitFilter;
import org.doxer.xbase.servlet.DoxDispatcherServlet;
import org.seasar.extension.filter.RequestDumpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.Filter;
import java.util.HashMap;

import static com.github.hatimiti.doxer.common.util.CharacterEncoding.UTF8;
import static java.util.Arrays.asList;

@Configuration
public abstract class DoxWebXml extends SpringBootServletInitializer {

	@Bean
	public DoxDispatcherServlet dispatcherServlet() {
		return new DoxDispatcherServlet();
	}

	@Bean
	public ServletRegistrationBean dispatcherServletRegistration() {
		ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet());
		return registration;
	}

	@Bean
	public FilterRegistrationBean registCharacterEncodingFilter() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		Filter filter = new CharacterEncodingFilter();
		registrationBean.setFilter(filter);
		registrationBean.setOrder(1);
		registrationBean.setInitParameters(new HashMap<String, String>() {{
			put("encoding", UTF8.toString());
			put("forceEncoding", "true");
		}});
		registrationBean.setUrlPatterns(asList(new String[] { "/*" }));
		return registrationBean;
	}

	@Bean
	public FilterRegistrationBean registThreadLocalInitFilter() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		Filter filter = new ThreadLocalInitFilter();
		registrationBean.setFilter(filter);
		registrationBean.setOrder(2);
		registrationBean.setUrlPatterns(asList(new String[] { "/*" }));
		return registrationBean;
	}

	@Bean
	public FilterRegistrationBean registRequestDumpFilter() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		Filter filter = new RequestDumpFilter();
		registrationBean.setFilter(filter);
		registrationBean.setOrder(3);
		registrationBean.setInitParameters(new HashMap<String, String>() {{
			put("beforeContextAttribute", "false");
			put("afterContextAttribute", "false");
		}});
		registrationBean.setUrlPatterns(asList(new String[] { "/*" }));
		return registrationBean;
	}

}
