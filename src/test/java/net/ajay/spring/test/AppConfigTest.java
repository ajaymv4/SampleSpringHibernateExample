package net.ajay.spring.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

import net.ajay.spring.config.AppConfig;
import net.ajay.spring.service.HelloService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigWebContextLoader.class)
@WebAppConfiguration
public class AppConfigTest {

	
	@Autowired
	HelloService helloService;
	
	
	@Test
    public void testApplicationContext() {

/*        //assert correct type/impl
        assertTrue(helloService instanceof HelloService);
        
        
        String str = helloService.getMessage("ajay");
        
        assertEquals("Hello who is this!!! ajay",str);*/
        
	}
}
