package com.myblog.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;  
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/spring.xml")
@WebAppConfiguration
public class TestController {
	 private MockMvc mockMvc;
	 @Autowired
	 private WebApplicationContext webApplicationContext;
	 @Before
	    public void setUp() throws Exception {
	        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	        viewResolver.setPrefix("/WEB-INF/jsp/");
	        viewResolver.setSuffix(".jsp");
	    }
	 
	 @Test
	    public void demo() throws Exception {
		 mockMvc.perform(get("/sort")).andExpect(MockMvcResultMatchers.view().name("hello1"));
	    }



}
