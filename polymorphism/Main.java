package polymorphism;

public class Main {
    public static void main(String[] args) {
//       BaseLoggar[] loggers=new BaseLoggar[]{new FileLoggar(),new EmailLoggar(),new DatabaseLoggar()};
//       for(BaseLoggar logger:loggers){
//           logger.Log("Log Mesajı");
//       }

        CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
    }
}
