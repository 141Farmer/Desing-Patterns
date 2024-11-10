public class Computer{
          private String cpu;
          private String ram;
          private String hdd;

          public void setCpu(String cpu){
                    this.cpu=cpu;
          }

          public void setRam(String ram){
                    this.ram=ram;
          }

          public void setHdd(String hdd){
                    this.hdd=hdd;
          }

          public void displayInfo(){
                    System.out.println("Cpu: "+cpu+"\nRam: "+ram+"\nHdd: "+hdd);
          }
          
}