public class Main {
          public static void main(String[] args) {
              PizzaOrderFacade pizzaOrderFacade = new PizzaOrderFacade();
      
              // Client provides only essential details
              String cardNumber = "1234-5678-9012-3456";
              String pin = "1234";
              double amount = 20.00;
      
              // Order a pizza
              boolean success = pizzaOrderFacade.orderPizza(cardNumber, pin, amount);
      
              if (success) {
                  System.out.println("Enjoy your pizza!");
              } else {
                  System.out.println("Pizza order failed.");
              }
          }
      }
      