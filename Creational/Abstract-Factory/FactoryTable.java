public class FactoryTable implements Factory{

          @Override
          public ModernFurniture createModernFurniture(){
                    return new ModernTable();
          }

          @Override
          public VictorianFurniture createVictorianFurniture(){
                    return new VictorianTable();
          }
          
}
