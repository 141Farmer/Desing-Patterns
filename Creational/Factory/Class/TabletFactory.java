public class TabletFactory implements DeviceFactory {
          @Override
          public Device createDevice() {
              return new Tablet();
          }
}