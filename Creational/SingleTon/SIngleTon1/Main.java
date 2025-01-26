public class Main{
          public static void main(String[] args) {
                   Factory factory;
                   
                   factory=new FactoryChair();
                   ModernFurniture modernChair=factory.createModernFurniture();
                   VictorianFurniture victorianCHair=factory.createVictorianFurniture();

                   modernChair.modern();
                   victorianCHair.victorian();

                   System.out.println("Modern Chair ID: " + modernChair.getId());
                   System.out.println("Victorian Chair ID: " + victorianCHair.getId());

                   factory=new FactoryTable();
                   ModernFurniture modernTable=factory.createModernFurniture();
                   VictorianFurniture victorianTable=factory.createVictorianFurniture();

                   modernTable.modern();
                   victorianTable.victorian();

                   System.out.println("Modern Table ID: " + modernTable.getId());
                   System.out.println("Victorian Table ID: " + victorianTable.getId());
          }
}