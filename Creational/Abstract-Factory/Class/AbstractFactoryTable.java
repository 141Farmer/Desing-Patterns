public class AbstractFactoryTable extends AbstractFactory {
    @Override
    public FurnitureModern createProductModern(){
        return new ModernTable(); 
    }
    @Override
    public FurnitureRustic createProductRustic(){
        return new RusticTable();
    }
    @Override
    public FurnitureVictorian createProductVictorian(){
        return new VictorianTable();
    }

    
}
