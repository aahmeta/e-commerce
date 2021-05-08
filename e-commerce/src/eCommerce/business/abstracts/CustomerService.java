package eCommerce.business.abstracts;

import eCommerce.entities.concretes.Customer;

public interface CustomerService {
	
	void register(Customer customer);
	
	void mailOnay(Customer customer);
	
	void login(Customer customer);
	
	

}
