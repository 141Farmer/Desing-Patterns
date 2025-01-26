public class Main {
          public static void main(String[] args) {
                    Products productElectric=new ProductElectric("Laptop", "HP", "10", "10h", "1-h");
                    Products productCloth=new ProductCloth("Shirt", "HP", "10", "10h", "1-h");
                    
                    ProductClient productClient;
                    
                    productClient=new ProductClient(productCloth);
                    Products cloth=productClient.createProduct();

                    productClient=new ProductClient(productElectric);
                    Products electric=productClient.createProduct();
          
          }
}
