public class Main{
          public static void main(String args[]){
                    Device device;
                    DeviceFactory factory;

                    factory=new SmartphoneFactory();
                    device=factory.createDevice();
                    device.powerOff();

                    factory=new TabletFactory();
                    device=factory.createDevice();
                    device.powerOn();

          }
}