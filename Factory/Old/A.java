abstract class Vehicle{
          public abstract void printVehicle();
}

class TwoWheeler extends Vehicle{
          public void printVehicle(){
                    System.out.println("Two");
          }
}

class FourWheeler extends Vehicle{
          public void printVehicle(){
                    System.out.println("Four");
          }
}

class Client{
          private Vehicle pv;
          public Client(int type)
          {
                    if(type==1){
                              pv=new TwoWheeler();
                    }
                    else if(type==2){
                              pv=new FourWheeler();
                    }
                    else{
                              pv=null;
                    }
          }
          public void cleanup(){
                    if(pv!=null){
                              pv=null;
                    }
          }
          public Vehicle getVehicle(){
                    return pv;
          }
}

public class A{
          public static void main(String[] args) {
                    Client pc=new Client(2);
                    Vehicle pv=pc.getVehicle();
                    if(pv!=null){
                              pv.printVehicle();
                    }
                    pc.cleanup();
          }
}
