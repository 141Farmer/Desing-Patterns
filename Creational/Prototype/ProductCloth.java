public class ProductCloth  extends Products{

          private String color;
          private String size;

          public ProductCloth(String name,String category, String price,String color,String size)
          {
                    super(name,category,price);
                    this.color=color;
                    this.size=size;
          }

          @Override
          public Products clone(){
                    return new ProductCloth(this.getName(),this.getCategory(),this.getPrice(),this.color,this.size);
          }
          
}
