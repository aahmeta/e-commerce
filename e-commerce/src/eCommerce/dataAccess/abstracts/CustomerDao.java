package eCommerce.dataAccess.abstracts;

import java.util.List;

import eCommerce.entities.concretes.Customer;

public interface CustomerDao {
	
	void add(Customer customer);
	
	void dogrulamaili(Customer customer);
	
	Customer get(int id);
	
	static List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
