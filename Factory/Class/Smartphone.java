public class Smartphone implements Device {
          @Override
          public void powerOn() {
              System.out.println("Smartphone is powered on.");
          }
      
          @Override
          public void powerOff() {
              System.out.println("Smartphone is powered off.");
          }
}