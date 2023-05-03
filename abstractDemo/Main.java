package abstractDemo;

public class Main {
    public static void main(String[] args) {
        CutomerManager cutomerManager=new CutomerManager();
        cutomerManager.databaseManager=new SqlServerDatabaseManager();
        cutomerManager.getCustomers();
    }
}
