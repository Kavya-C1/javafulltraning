package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService{

	@Autowired
	private IProductRepository productRepository;
	
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productRepository.addProduct(product);
	}

	@Override
	public void updateProduct(int productId, double price) {
		// TODO Auto-generated method stub
		productRepository.updateProduct(productId, price);
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		productRepository.deleteProduct(productId);
	}

	@Override
	public Product getById(int productId) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		Product product =productRepository.findById(productId);
		if(product==null)
			throw new ProductNotFoundException();
		return  product;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		List<Product> products = productRepository.findAll();
		if(products.isEmpty())
			throw new ProductNotFoundException();
		return products;
	}

	@Override
	public List<Product> getByBrand(String brand) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		List<Product> products = productRepository.findByBrand(brand);
		if(products.isEmpty())
			throw new ProductNotFoundException();
		return products;
	}

	@Override
	public List<Product> getByLessPrice(double price) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		List<Product> products = productRepository.findByLessPrice(price);
		if(products.isEmpty())
			throw new ProductNotFoundException();
		return products;
	}

	@Override
	public List<Product> getByCategoryAndPrice(String category, double price) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		List<Product> products = productRepository.findByCategoryAndPrice(category, price);
		if(products.isEmpty())
			throw new ProductNotFoundException();
		return products;
	}

}
