
public class Smartphone implements Device{
          public String battery;

          @Override
          public void powerOff(){
                    System.out.println("Smart phone off");
          }
          @Override
          public void powerOn(){
                    System.out.println("Smart phone on");
          }
}

