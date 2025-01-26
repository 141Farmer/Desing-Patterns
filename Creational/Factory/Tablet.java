
public class Tablet implements Device{
          public String size;

          @Override
          public void powerOff(){
                    System.out.println("Tablet off");
          }
          @Override
          public void powerOn(){
                    System.out.println("Tablet on");
          }
}

