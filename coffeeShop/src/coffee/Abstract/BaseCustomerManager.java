package coffee.Abstract;

import java.rmi.RemoteException;

import coffee.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	public void save(Customer customer) throws RemoteException {
		
		System.out.println("Saved to database " + customer.getFirstName());
		
	}

}
