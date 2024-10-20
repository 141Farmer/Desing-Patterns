public class Laptop implements Device {
          @Override
          public void powerOn() {
              System.out.println("Laptop is powered on.");
          }
      
          @Override
          public void powerOff() {
              System.out.println("Laptop is powered off.");
          }
}