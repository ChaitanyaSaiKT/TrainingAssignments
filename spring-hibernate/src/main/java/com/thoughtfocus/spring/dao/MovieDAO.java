package com.thoughtfocus.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.thoughtfocus.spring.dto.MovieDTO;


public interface MovieDAO {
	
	public void saveMovie(MovieDTO dto);
	public List<Object[]>getAllMovies();
	public void updateBudgetByName(String name, long budget);
	public void deleteDataById(int id);

}
