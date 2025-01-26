public class ProductClient { 
          private Products productClient;

          public ProductClient(Products productClient)
          {
                    this.productClient=productClient;
          }

          public Products createProduct(){
                    return productClient.clone();
          }
          
}
