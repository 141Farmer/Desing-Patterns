public class BalanceCheck {

          public boolean hasSufficientBalance(String cardNumber, double amount) {
                    System.out.println("Checking balance for card: " + cardNumber);
                    return amount<=100.00;
          }
}
