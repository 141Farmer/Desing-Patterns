public class Main {
          public static void main(String[] args) {
              Registry registry = new Registry();
      
              registry.addPrototype("BasicTShirt", new ProductCloth("T-Shirt", "Clothing", "20.00", "White", "M"));
              registry.addPrototype("Smartphone", new ProductElectric("Smartphone", "Electronics", "699.00", "128GB", "24 hours"));

              ProductCloth clonedTShirt = (ProductCloth) registry.getPrototype("BasicTShirt");
              ProductElectric clonedSmartphone = (ProductElectric) registry.getPrototype("Smartphone");

              clonedTShirt = new ProductCloth("T-Shirt", "Clothing", "25.00", "Black", "L");
              clonedSmartphone = new ProductElectric("Smartphone", "Electronics", "799.00", "256GB", "30 hours");

              System.out.println(clonedTShirt);
              System.out.println(clonedSmartphone);
          }
      }
      