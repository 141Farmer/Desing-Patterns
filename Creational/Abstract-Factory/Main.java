public class Main{
          public static void main(String[] args) {
                   Factory factory;
                   
                   factory=new FactoryChair();
                   ModernFurniture modernChair=factory.createModernFurniture();
                   VictorianFurniture victorianCHair=factory.createVictorianFurniture();

                   modernChair.modern();
                   victorianCHair.victorian();

                   factory=new FactoryTable();
                   ModernFurniture modernTable=factory.createModernFurniture();
                   VictorianFurniture victorianTable=factory.createVictorianFurniture();

                   modernTable.modern();
                   victorianTable.victorian();
          }
}