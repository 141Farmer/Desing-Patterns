public class GamingComputerBuilder implements Builder{

          private Computer computer=new Computer();

          @Override
          public void buildCpu(){
                    computer.setCpu("AMD");
          }
          
          @Override
          public void buildRam(){
                    computer.setRam("64GB");
          }

          @Override
          public void buildHdd(){
                    computer.setHdd("1TB");
          }

          @Override
          public Computer getResult(){
                    return computer;
          }
}
