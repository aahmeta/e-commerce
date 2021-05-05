package coffee;

import java.rmi.RemoteException;

import coffee.Abstract.BaseCustomerManager;
import coffee.Concrete.CustomerCheckManager;
import coffee.Concrete.NeroCustomerManager;
import coffee.Concrete.StarbucksCustomerManager;
import coffee.Entities.Customer;
import coffee.adapters.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1, "firstName1", "lastName1", 2001, "1234"));
		
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager2.save(new Customer(2, "firstName2", "lastName2", 2002, "56789"));
		
		
	}
}
