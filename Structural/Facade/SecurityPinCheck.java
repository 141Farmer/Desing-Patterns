public class SecurityPinCheck {

          public boolean isPinCorrect(String cardNumber, String pin) {
                    System.out.println("Checking PIN for card: " + cardNumber);
                    return "1234".equals(pin); 
          }
}
