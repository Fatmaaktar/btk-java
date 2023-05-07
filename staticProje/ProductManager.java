package staticProje;

public class ProductManager {
    public void add(Product product){

        if(ProductValidatior.isValid(product)){
            System.out.println("Eklendi");
        }else{
            System.out.println("Ürün Bilgileri geçersizdir!");
        }

    }
}
