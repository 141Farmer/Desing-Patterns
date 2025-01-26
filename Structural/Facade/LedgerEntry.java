public class LedgerEntry {
          
          public void recordTransaction(String cardNumber, double amount, String operation) {
                    System.out.println("Recording transaction: " + operation + " of $" + amount + " for card: " + cardNumber);
          }
}
