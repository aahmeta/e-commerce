package coffee.Concrete;

import java.rmi.RemoteException;

import coffee.Abstract.BaseCustomerManager;
import coffee.Abstract.ICustomerCheckService;
import coffee.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService; 
	}
	
	@Override
	public void save(Customer customer) throws RemoteException {
		if(customerCheckService.checkIfRealPerson(customer)) {
			save(customer);
		} else {
			System.out.println("invalid...");
		}
	}
}
