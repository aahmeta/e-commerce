package eCommerce.dataAccess.concretes;
import java.util.List;


import eCommerce.dataAccess.abstracts.CustomerDao;
import eCommerce.entities.concretes.Customer;

public class AbcCustomerDao implements CustomerDao {
	@Override
	public void add(Customer customer) {
		
		System.out.println("Database eklendi.");
		
	}
	
	@Override
	public void dogrulamaili(Customer customer) {
		System.out.println("Dogrulama maili gönderildi.");
	}

	@Override
	public Customer get(int id) {
		
		return null;
	}

	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
