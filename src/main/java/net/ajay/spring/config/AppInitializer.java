package net.ajay.spring.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import net.ajay.spring.dto.CustomerDetails;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebApplicationInitializer  {

	
	@ModelAttribute("customerDetails")
	   public CustomerDetails setUpUserForm() {
	      return new CustomerDetails();
	   }
	
	public void onStartup(ServletContext container) throws ServletException {

		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(AppConfig.class);
		ctx.setServletContext(container);
		 container.addListener(new ContextLoaderListener(ctx));

		ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));

		servlet.setLoadOnStartup(1);
		
		servlet.addMapping("/");
		
		
		
		
	}
	
	
	@Override
	   protected Class<?>[] getRootConfigClasses() {
	      return new Class[] {};
	   }

	   @Override
	   protected Class<?>[] getServletConfigClasses() {
	      return new Class[] { AppConfig.class };
	   }

	   @Override
	   protected String[] getServletMappings() {
	      return new String[] { "/" };
	   }

}