public class ProductElectric  extends Products{

          private String capacity;
          private String battery;

          public ProductElectric(String name,String category, String price,String capacity,String battery)
          {
                    super(name,category,price);
                    this.capacity=capacity;
                    this.battery=battery;
          }

          @Override
          public Products clone(){
                    return new ProductElectric(this.getName(),this.getCategory(),this.getPrice(),this.capacity,this.battery);
          }
          
}
