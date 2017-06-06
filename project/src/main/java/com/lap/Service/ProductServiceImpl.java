package com.lap.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lap.Dao.ProductDao;
import com.lap.Model.Product;
@Service
public class ProductServiceImpl implements ProductService{
@Autowired	
private ProductDao productDao;
	public void saveProduct(Product product) {
	   productDao.saveProduct(product);
		
	}
	

}