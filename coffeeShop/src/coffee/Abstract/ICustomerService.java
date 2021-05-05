package coffee.Abstract;

import java.rmi.RemoteException;

import coffee.Entities.Customer;


public interface ICustomerService {
	
	void save(Customer customer) throws RemoteException;

}
