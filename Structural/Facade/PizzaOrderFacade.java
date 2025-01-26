public class PizzaOrderFacade {
          private AccountCheck accountCheck;
          private SecurityPinCheck pinCheck;
          private BalanceCheck balanceCheck;
          private LedgerEntry ledgerEntry;
          private Notification notification;

          public PizzaOrderFacade() {
                    accountCheck = new AccountCheck();
                    pinCheck = new SecurityPinCheck();
                    balanceCheck = new BalanceCheck();
                    ledgerEntry = new LedgerEntry();
                    notification = new Notification();
          }

          public boolean orderPizza(String cardNumber, String pin, double amount) {
                    System.out.println("Starting pizza order process...");
                    if (!accountCheck.isAccountActive(cardNumber)) {
                              System.out.println("Account is inactive.");
                              return false;
                    }           

                    if (!pinCheck.isPinCorrect(cardNumber, pin)) {
                              System.out.println("Incorrect PIN.");
                              return false;
                    }

                    if (!balanceCheck.hasSufficientBalance(cardNumber, amount)) {
                              System.out.println("Insufficient balance.");
                              return false;
                    }

                    ledgerEntry.recordTransaction(cardNumber, amount, "Pizza Order");
                    notification.sendNotification("Your pizza order for $" + amount + " has been placed successfully.");
                    System.out.println("Pizza order completed successfully!");
                    return true;
          }
}
