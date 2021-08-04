package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Customer;

public class CustomerService {

	private Map<String, Customer> customerMap;
	
	//Singleton
	private static final CustomerService instance = new CustomerService();
	
	private CustomerService() {
		customerMap = new HashMap<String, Customer>();
		
		addCustomer(new Customer("id001", "alice"));
		addCustomer(new Customer("id002", "bob"));
		addCustomer(new Customer("id003", "charlie"));
		addCustomer(new Customer("id004", "daniel"));
		addCustomer(new Customer("id005", "trudy"));

	}
	
	//Singleton
	public static CustomerService getInstance() {
		return instance;
	}
	
	//해시맵에 customer 정보 삽입
	private void addCustomer(Customer customer) {
		customerMap.put(customer.getId(), customer);
	}
	
	//customer 조회
	public Customer findCustomer(String id) {
		if(id != null)
			return customerMap.get(id.toLowerCase());
		else
			return null;
	}
	
	//전체 customer 조회
	public List<Customer> getAllCustomer() {
		List<Customer> customerList = new ArrayList<Customer>(customerMap.values());
		
		return customerList;
	}
	
}
