package com.ust.rest.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ust.rest.repository.ProductRepositary;
import com.ust.rest.repository.UserRepository;
import com.ust.rest.resource.Product;
import com.ust.rest.resource.User;

@Service
public class ProductService {

	// services is calling the repository
	// service acts as a link
	@Autowired
	ProductRepositary productRepository;

	@Autowired
	UserRepository userRepository;

	public Product getProduct(long productId) {
		// return repository.getProduct(productId);
		Optional<Product> optional = productRepository.findById(productId);
		if (optional.isPresent()) {
			return optional.get();

		} else {
			return null;
		}
	}

//	
	public List<Product> getProduct() {
		return productRepository.findAll();
	}

	/* 	working code example 1
	 * @Transactional(propagation=Propagation.REQUIRED)
	 * 
	 * public Product add(Product product) { Product productT=
	 * productRepository.save(product);
	 * 
	 * User user=new User(); user.setUserId(5L);
	 * user.setDateTime(System.currentTimeMillis()+"");
	 * 
	 * 
	 * 
	 * User userT=userRepository.save(user); return productT; }
	 * 
	 * if(userT!=null && productT!=null ) { return new
	 * ReponseEntity<?>.ok(productT); } else {throw new
	 * RuntimeException("record not inserted...."); }
	 */
//Example 2 REQUIRES_new
	@Transactional(propagation = Propagation.REQUIRED)

	public Product add(Product product) {
		Product productT = productRepository.save(product);

		addUser();
		return productT;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
    public boolean addUser() {
	User user = new User();
	user.setUserId(5L);
	user.setDateTime(System.currentTimeMillis() + "12345234567812345678");
	try {
		User userT = userRepository.save(user);
	}catch(Exception e) {
		System.out.println(e);
	}

	User userT = userRepository.save(user);
	return true;
}
//	
	// update
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

//	
	// delete
	public void deleteProduct(long productId) {
		productRepository.deleteById(productId);
	}
}
