public class CreamDecorator extends CoffeeDecorator {
          public CreamDecorator(Coffee decoratedCoffee) {
              super(decoratedCoffee);
          }
            
          @Override
          public String getDescription() {
              return decoratedCoffee.getDescription() + ", Cream";
          }       
      }