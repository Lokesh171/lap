package com.lap.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lap.Model.Product;
@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
private SessionFactory sessionFactory;
	public void saveProduct(Product product) {
		Session session=sessionFactory.openSession();
		System.out.println("PRODUCT ID BEFORE INSERTION " + product.getId());
		session.save(product);
		System.out.println("PRODUCT ID AFTER INSERTION " + product.getId());
		session.flush();
		session.close();
	}

}