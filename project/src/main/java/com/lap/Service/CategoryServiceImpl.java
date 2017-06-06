package com.lap.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lap.Dao.CategoryDao;
import com.lap.Model.Category;
@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
private CategoryDao categoryDao;
	public List<Category> getAllCategories() {
		return categoryDao.getAllCategories();
	}

}