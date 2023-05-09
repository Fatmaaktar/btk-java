package arraylistDemo2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers=new ArrayList<Customer>();
        customers.add(new Customer(1,"Engin","Demiroğ"));
        customers.add(new Customer(2,"Derin","Demiroğ"));
        customers.add(new Customer(3,"Salih","Demiroğ"));

        for (Customer customer:customers){
            System.out.println(customer.firstName);
            System.out.println(customer.lastName);
            System.out.println(customer.id);
        }
    }
}
