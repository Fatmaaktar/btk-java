package repositoryDemo;

public class Main {
    public static void main(String[] args) {
        //generics method özelliği
        Validator validator=new Validator();
        Customer customer=new Customer();
        validator.validator(customer);
    }
}
