public class Tablet implements Device {
          @Override
          public void powerOn() {
              System.out.println("Tablet is powered on.");
          }
      
          @Override
          public void powerOff() {
              System.out.println("Tablet is powered off.");
          }
}