public class Main {
          public static void main(String[] args){
             
                    Coffee coffee=new BasicCoffee();
                    System.out.println("Description: " + coffee.getDescription());
                    
                    Coffee creamCoffee=new CreamDecorator(coffee);
                    System.out.println("\nDescription: " + creamCoffee.getDescription());

                    Coffee milkCreamCoffee=new MilkDecorator(creamCoffee);
                    System.out.println("\nDescription: " + milkCreamCoffee.getDescription());
                    
                    Coffee sugarMilkCreamCoffee=new SugarDecorator(milkCreamCoffee);
                    System.out.println("\nDescription: " + sugarMilkCreamCoffee.getDescription());
          }
}