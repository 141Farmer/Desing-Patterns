public class Main {

          public static void main(String[] args) {
                    Builder builder=new GamingComputerBuilder();
                    ComputerDirector computerDirector=new ComputerDirector();

                    computerDirector.construct(builder);
                    Computer gamingComputer=builder.getResult();
                    gamingComputer.displayInfo();


          }
          
}
