package com.thoughtfocus.spring.runner;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thoughtfocus.spring.dao.MovieDAO;
import com.thoughtfocus.spring.dto.MovieDTO;

public class Runner {
	
	public static void main(String[] args) {
		
		Logger logger = LoggerFactory.getLogger(Runner.class);
		
		MovieDTO dto = new MovieDTO();
		dto.setId(1);
		dto.setName("Avatar");
		dto.setYearreleased(2009);
		dto.setLanguage("English");
		dto.setBudget(150000);
		
		MovieDTO dto2 =new MovieDTO();
		dto2.setId(2);
		dto2.setName("RRR");
		dto2.setYearreleased(2022);
		dto2.setLanguage("Telugu");
		dto2.setBudget(850000);
		
		MovieDTO dto3 = new MovieDTO();
		dto3.setId(3);
		dto3.setName("Titanic");
		dto3.setYearreleased(1997);
		dto3.setLanguage("English");
		dto3.setBudget(370000);
		
		MovieDTO dto4 = new MovieDTO();
		dto4.setId(4);
		dto4.setName("Sholay");
		dto4.setYearreleased(1975);
		dto4.setLanguage("Hindi");
		dto4.setBudget(20000);
		
		MovieDTO dto5 = new MovieDTO();
		dto5.setId(5);
		dto5.setName("Bahubali");
		dto5.setYearreleased(2015);
		dto5.setLanguage("Telugu");
		dto5.setBudget(4150000);
		
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");
		
		MovieDAO bean = container.getBean(MovieDAO.class);
		bean.saveMovie(dto);
		bean.saveMovie(dto2);
		bean.saveMovie(dto3);
		bean.saveMovie(dto4);
		bean.saveMovie(dto5);
		List<Object[]> li = (List<Object[]>)bean.getAllMovies();
		logger.info(li.toString());
		bean.updateBudgetByName("Avatar", 124500);
		bean.deleteDataById(4);
		
	}

}
