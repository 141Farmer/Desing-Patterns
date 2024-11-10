class Client {
          private Vehicle pVehicle;
      
          public Client(VehicleFactory factory) {
              pVehicle = factory.CreateVehicle();
          }
      
          public Vehicle getVehicle() {
              return pVehicle;
          }
      }