public abstract class Products {

          private String name;
          private String category;
          private String price;

          public Products(String name,String category, String price)
          {
                    this.name=name;
                    this.category=category;
                    this.price=price;
          }

          public String getName() {
                    return name;
          }
            
                public String getCategory() {
                    return category;
          }
            
                public String getPrice() {
                    return price;
          }

          public abstract Products clone();
          
}
