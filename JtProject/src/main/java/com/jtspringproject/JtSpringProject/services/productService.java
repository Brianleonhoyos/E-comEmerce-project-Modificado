package com.jtspringproject.JtSpringProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jtspringproject.JtSpringProject.dao.productDao;
import com.jtspringproject.JtSpringProject.models.Product;

@Service
public class productService {

	@Autowired
	private static productService instance;

	@Autowired
	private productDao productDao;

	private productService() {
		productDao = new productDao();
	}

	public static synchronized productService getInstance() {
		if (instance == null) {
			instance = new productService();
		}
		return instance;
	}

	public void addProduct(Product product) {
		productDao.addProduct(product);
	}

	public Product getProduct(int id) {
		return productDao.getProduct(id);
	}

	public List<Product> getProducts() {
		return productDao.getProducts();
	}

	public void deleteProduct(int id) {
		productDao.deleteProduct(id);
	}

	public void updateProduct(Product product) {
		productDao.updateProduct(product);
	}
}
