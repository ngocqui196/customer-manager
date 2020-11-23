package sevice;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerSeviceImpl implements CustomerSevice{

    private static Map<Integer,Customer> customers;

    static {
        customers = new HashMap<>(  );
        customers.put(1,new Customer(1,"Tuấn","thamsattatca@gmail.com","Vinh Phuc"));
        customers.put(2,new Customer(2,"Lập","thienduongtoiac@gmail.com","Hoa Binh"));
        customers.put(3,new Customer(3,"Toàn","hoanghonao@gmail.com","Hue"));
        customers.put(4,new Customer(4,"Chiến","loicaunguyentruochoanghon@gmail.com","HCM"));
        customers.put(5,new Customer(5,"Khanh","chamhettatca@gmail.com","Binh Phuoc"));
    }

    @Override
    public List<Customer> findAll() {

        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {

        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
