public class Main {
          public static void main(String[] args) {

              DeviceFactory factory;

              factory= new SmartphoneFactory();
              Device smartphone=factory.createDevice();
              smartphone.powerOn();
              smartphone.powerOff();
      
              factory=new TabletFactory();
              Device tablet=factory.createDevice();
              tablet.powerOn();
              tablet.powerOff();
      
              factory=new LaptopFactory();
              Device laptop=factory.createDevice();
              laptop.powerOn();
              laptop.powerOff();
          }
}
      